package observer.case3.concrete_observer;

import observer.case3.CheckList;
import observer.case3.observer.AlarmListener;

public class Surveillance extends CheckList implements AlarmListener {

	@Override
	public void alarm() {
		System.out.println("Surveillance - by the numbers:");
		byTheNumbers();
	}

	@Override
	protected void isolate() {
//        super.isolate();
		System.out.println("   train the cameras");
	}

}
