package event_sourcing.case1.processor;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import event_sourcing.case1.event.AccountCreateEvent;
import event_sourcing.case1.event.DomainEvent;
import event_sourcing.case1.event.MoneyDepositEvent;
import event_sourcing.case1.event.MoneyTransferEvent;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * This is the implementation of event journal.
 * This implementation serialize/deserialize the events with JSON and writes/reads them on a Journal.json file at the working directory.
 */
public class JsonFileJournal {

	private final File file;
	private final List<String> events = new ArrayList<>();
	private int index = 0;

	public JsonFileJournal() {

		file = new File("Journal.json");

		if (file.exists()) {

			try (var input = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))) {

				String line;
				while ((line = input.readLine()) != null) {
					events.add(line);
				}

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		} else {
			reset();
		}
	}

	public void write(DomainEvent domainEvent) {

		var gson = new Gson();
		JsonElement jsonElement;

		if (domainEvent instanceof AccountCreateEvent) {
			jsonElement = gson.toJsonTree(domainEvent, AccountCreateEvent.class);

		} else if (domainEvent instanceof MoneyDepositEvent) {
			jsonElement = gson.toJsonTree(domainEvent, MoneyDepositEvent.class);

		} else if (domainEvent instanceof MoneyTransferEvent) {
			jsonElement = gson.toJsonTree(domainEvent, MoneyTransferEvent.class);

		} else {
			throw new RuntimeException("Journal Event not recegnized");
		}

		try (var output = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), StandardCharsets.UTF_8))) {
			var eventString = jsonElement.toString();
			output.write(eventString + "\r\n");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public void reset() {
		file.delete();
	}

	public DomainEvent readNext() {

		if (index >= events.size()) {
			return null;
		}

		var event = events.get(index);
		index++;

		var parser = new JsonParser();
		var jsonElement = parser.parse(event);
		var eventClassName = jsonElement.getAsJsonObject().get("eventClassName").getAsString();
		var gson = new Gson();
		DomainEvent domainEvent;

		if (eventClassName.equals("AccountCreateEvent")) {
			domainEvent = gson.fromJson(jsonElement, AccountCreateEvent.class);

		} else if (eventClassName.equals("MoneyDepositEvent")) {
			domainEvent = gson.fromJson(jsonElement, MoneyDepositEvent.class);

		} else if (eventClassName.equals("MoneyTransferEvent")) {
			domainEvent = gson.fromJson(jsonElement, MoneyTransferEvent.class);

		} else {
			throw new RuntimeException("Journal Event not recegnized");
		}

		domainEvent.setRealTime(false);
		return domainEvent;
	}
}
