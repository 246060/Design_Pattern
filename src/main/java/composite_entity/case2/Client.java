package composite_entity.case2;

import java.util.Arrays;

public class Client {

	public static void main(String[] args) {

		var console = new CompositeEntity();
		console.init();

		console.setData("No Danger", "Green Light");
		Arrays.stream(console.getData()).forEach(System.out::println);

		console.setData("Danger", "Red Light");
		Arrays.stream(console.getData()).forEach(System.out::println);
	}
}
