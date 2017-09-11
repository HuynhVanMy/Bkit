package view;

import bean.Student;
import controller.StudentController;

public class StudentView {
	public static void main(String[] args) {
		StudentController controller = new StudentController();
		Student st = new Student();
		st = controller.inputData();
		System.out.println(st.toString());
	}
}
