package flyweight.case3.concrete_flyweight;

import flyweight.case3.Engine;
import flyweight.case3.flyweight.Vehicle;

import java.awt.*;

public class Car implements Vehicle {

	private Engine engine;
	private Color color;

	public Car(Engine engine, Color color) {
		this.engine = engine;
		this.color = color;

		// Building a new car is a very expensive operation!
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.err.println("Error while creating a new car");
		}
	}

	@Override
	public void start() {
		System.out.println("Car is starting!");
		engine.start();
	}

	@Override
	public void stop() {
		System.out.println("Car is stopping!");
		engine.stop();
	}

	@Override
	public Color getColor() {
		return this.color;
	}

}
