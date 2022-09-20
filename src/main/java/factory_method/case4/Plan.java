package factory_method.case4;

public abstract class Plan {
	protected double rate;
	abstract void getRate();

	public void calculateBill(int units) {
		getRate();
		System.out.println(units * rate);
	}
}
