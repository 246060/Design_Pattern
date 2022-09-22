package decorator.case1.Component_Implementation;


import decorator.case1.Component_Interface.Car;

// Component Implementation
public class BasicCar implements Car {

	@Override
	public void assemble() {
		System.out.print("Basic Car.");
	}
}
