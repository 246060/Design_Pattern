package cqrs;

import java.util.HashMap;

public class Command {

	private static Long id = 0L;
	private static HashMap<Long, Entity> repo = new HashMap<>();

	private Publisher publisher;

	public Command(Publisher publisher) {
		this.publisher = publisher;
	}

	public void save(Entity entity) {
		entity.setId(++id);
		repo.put(entity.getId(), entity);

		publisher.publish(new Event("add", entity));
	}

	public void delete(Entity entity) {
		repo.remove(entity.getId());

		publisher.publish(new Event("delete", entity));
	}
}
