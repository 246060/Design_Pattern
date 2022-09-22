package observer.case4.observer;

import observer.case4.observable.Subject;

public interface Observer {

	//method to update the observer, used by subject
	void update();

	//attach with subject to observe
	void setSubject(Subject sub);
}
