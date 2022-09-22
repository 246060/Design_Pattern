package flyweight.case4.flyweight_factory;

import flyweight.case4.concrete_flyweight.CounterTerrorist;
import flyweight.case4.concrete_flyweight.Terrorist;
import flyweight.case4.flyweight.Player;

import java.util.HashMap;

public class PlayerFactory {

	private static HashMap<String, Player> hm = new HashMap<>();

	public static Player getPlayer(String type) {
		Player p = null;

		if (hm.containsKey(type)) {
			p = hm.get(type);

		} else {

			switch (type) {

				case "Terrorist":
					System.out.println("Terrorist Created");
					p = new Terrorist();
					break;

				case "CounterTerrorist":
					System.out.println("Counter Terrorist Created");
					p = new CounterTerrorist();
					break;

				default:
					System.out.println("Unreachable code!");
			}

			hm.put(type, p);
		}

		return p;
	}
}
