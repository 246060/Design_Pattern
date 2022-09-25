package interpreter.case2.Context;

import interpreter.case2.Row;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Context {

	private static Map<String, List<Row>> tables = new HashMap<>();

	static {
		List<Row> list = new ArrayList<>();
		list.add(new Row("John", "Doe"));
		list.add(new Row("Jan", "Kowalski"));
		list.add(new Row("Dominic", "Doom"));

		tables.put("people", list);
	}

	private String table;
	private String column;

	private int colIndex = -1;

	private static final Predicate<String> matchAnyString = s -> s.length() > 0;
	private static final Function<String, Stream<? extends String>> matchAllColumns = Stream::of;

	private Predicate<String> whereFilter = matchAnyString;
	private Function<String, Stream<? extends String>> columnMapper = matchAllColumns;

	public void setColumn(String column) {
		this.column = column;
		setColumnMapper();
	}

	public void setTable(String table) {
		this.table = table;
	}

	public void setFilter(Predicate<String> whereFilter) {
		this.whereFilter = whereFilter;
	}

	/**
	 * Sets column mapper based on {@link #column} attribute.
	 * Note: If column is unknown, will remain to look for all columns.
	 */
	public void setColumnMapper() {

		switch (column) {
			case "*":
				colIndex = -1;
				break;
			case "name":
				colIndex = 0;
				break;
			case "surname":
				colIndex = 1;
				break;
		}

		if (colIndex != -1) {
			columnMapper = s -> Stream.of(s.split(" ")[colIndex]);
		}
	}

	/**
	 * Clears the context to defaults.
	 * No filters, match all columns.
	 */
	void clear() {
		column = "";
		columnMapper = matchAllColumns;
		whereFilter = matchAnyString;
	}


	public List<String> search() {

		List<String> result
						= tables.entrySet().stream()
						.filter(entry -> entry.getKey().equalsIgnoreCase(table))
						.flatMap(entry -> Stream.of(entry.getValue()))
						.flatMap(Collection::stream)
						.map(Row::toString)
						.flatMap(columnMapper)
						.filter(whereFilter)
						.collect(Collectors.toList());

		clear();
		return result;
	}
}
