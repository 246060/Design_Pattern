package adapter.case6.adaptee;

public class CelsiusReporter {

	protected double temperatureInC;

	public CelsiusReporter() {
	}

	public double getTemperature() {
		return temperatureInC;
	}

	public void setTemperature(double temperatureInC) {
		this.temperatureInC = temperatureInC;
	}

}
