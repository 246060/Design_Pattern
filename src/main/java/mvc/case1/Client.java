package mvc.case1;

import mvc.case1.controller.StudentController;
import mvc.case1.model.Student;
import mvc.case1.view.StudentView;

public class Client {

	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}

	public static void main(String[] args) {

		//fetch student record based on his roll no from the database
		Student model = retriveStudentFromDatabase();

		//Create a view : to write student details on console
		StudentView view = new StudentView();

		StudentController controller = new StudentController(model, view);

		controller.updateView();

		//update model data
		controller.setStudentName("John");

		controller.updateView();
	}
}
