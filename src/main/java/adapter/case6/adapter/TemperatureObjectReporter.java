package adapter.case6.adapter;

import adapter.case6.adaptee.CelsiusReporter;

public class TemperatureObjectReporter implements TemperatureInfo {

	CelsiusReporter celsiusReporter;

	public TemperatureObjectReporter() {
		celsiusReporter = new CelsiusReporter();
	}

	@Override
	public double getTemperatureInC() {
		return celsiusReporter.getTemperature();
	}

	@Override
	public double getTemperatureInF() {
		return cToF(celsiusReporter.getTemperature());
	}

	@Override
	public void setTemperatureInC(double temperatureInC) {
		celsiusReporter.setTemperature(temperatureInC);
	}

	@Override
	public void setTemperatureInF(double temperatureInF) {
		celsiusReporter.setTemperature(fToC(temperatureInF));
	}

	private double fToC(double f) {
		return ((f - 32) * 5 / 9);
	}

	private double cToF(double c) {
		return ((c * 9 / 5) + 32);
	}

}
