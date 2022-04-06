package singleton.case1;

public class BasicSingleTonClientWithSingleThread {

	public static void main(String[] args) {

		System.out.println(
			"If you see the same value, then singleton was reused (yay!)\n"
				+ "If you see different values, then 2 singletons were created (booo!!)\n"
				+ "RESULT:"
		);

		BasicSingleton singleton = BasicSingleton.getInstance("FOO");
		BasicSingleton anotherSingleton = BasicSingleton.getInstance("BAR");

		System.out.println(singleton.getValue());
		System.out.println(anotherSingleton.getValue());
	}
}
