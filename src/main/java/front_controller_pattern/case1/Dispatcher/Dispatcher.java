package front_controller_pattern.case1.Dispatcher;

import front_controller_pattern.case1.View.HomeView;
import front_controller_pattern.case1.View.StudentView;

public class Dispatcher {

	private StudentView studentView;
	private HomeView homeView;

	public Dispatcher(){
		studentView = new StudentView();
		homeView = new HomeView();
	}

	public void dispatch(String request){
		if(request.equalsIgnoreCase("STUDENT")){
			studentView.show();
		}
		else{
			homeView.show();
		}
	}
}
