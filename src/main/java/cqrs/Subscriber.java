package cqrs;

import java.util.HashMap;

public class Subscriber {

	private HashMap<Long, Entity> queryRepo;

	public void listen(Event event) {
		if ("add".equals(event.getEventType())) {
			queryRepo.put(event.getEntity().getId(), event.getEntity());
		} else if ("delete".equals(event.getEventType())) {
			queryRepo.remove(event.getEntity().getId());
		}
	}

	public void registerRepo(HashMap<Long, Entity> queryRepo) {
		this.queryRepo = queryRepo;
	}

}
