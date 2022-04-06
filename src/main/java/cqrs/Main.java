package cqrs;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		Broker broker = new Broker();
		Command command = new Command(new Publisher(broker));

		Subscriber subscriber = new Subscriber();
		Query query = new Query(subscriber);

		broker.register(subscriber);

		printAll(query, "query data before save");

		Entity entity1 = new Entity("user00");
		Entity entity2 = new Entity("user01");
		Entity entity3 = new Entity("user02");
		command.save(entity1);
		command.save(entity2);
		command.save(entity3);

		printAll(query, "query data before after");

		printOne(query, entity1.getId());

		command.delete(entity1);

		printAll(query, "query data before delete");
	}

	private static void printAll(Query query, String prefix) {
		System.out.println(prefix + " : ");

		List<Entity> all = query.getAll();
		if (all.isEmpty()) {
			System.out.println("not exist entity");
			System.out.println();
			return ;
		}
		for (Entity e : all) {
			System.out.println("entity = " + e);
		}
		System.out.println();
	}

	private static void printOne(Query query, Long id) {
		System.out.println("get entity1 = " + query.get(id));
		System.out.println();
	}

}
