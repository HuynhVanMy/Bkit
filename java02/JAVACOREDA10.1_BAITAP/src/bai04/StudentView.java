package bai04;

import java.util.ArrayList;
import java.util.List;

public class StudentView {

	public static void main(String[] args) {
		StudentController stuCtrl = new StudentController();
		List<Student> studentList = new ArrayList<>();
		boolean check = true;
		do {
			switch (stuCtrl.menu()) {
			case 1:
				studentList = stuCtrl.listStudent();
				break;
			case 2:
				stuCtrl.outputData(studentList);
				break;
			case 3:
				stuCtrl.sortListDiemTB(studentList);
				stuCtrl.outputData(studentList);
				break;
			case 4:
				stuCtrl.sortListAlphaBet(studentList);
				stuCtrl.outputData(studentList);
				break;
			case 5:
				stuCtrl.addStudent(studentList);
				break;
			case 6:
				stuCtrl.findStudent(studentList);
				break;
			case 7:
				stuCtrl.deleteStudent(studentList);
				break;
			case 8:
				check = false;
				break;

			default:
				System.out.println("Vui lòng nhập đúng chức năng!!!");
				break;
			}
		} while (check);

		System.out.println("==============><=============");
	}

}
