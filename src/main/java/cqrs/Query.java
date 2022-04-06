package cqrs;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Query {

	private static HashMap<Long, Entity> repo = new HashMap<>();

	private Subscriber subscriber;

	public Query(Subscriber subscriber) {
		this.subscriber = subscriber;
		subscriber.registerRepo(repo);
	}

	public List<Entity> getAll() {
		return repo.values().stream().collect(Collectors.toList());
	}

	public Entity get(Long id) {
		return repo.get(id);
	}
}
