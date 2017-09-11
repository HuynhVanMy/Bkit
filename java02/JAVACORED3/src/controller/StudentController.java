package controller;

import java.util.Random;
import java.util.Scanner;

import bean.Student;

public class StudentController {
	//xử lý
	public static void main(String[] args) {
		
	}
	
		public Student inputData(){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter fullName: ");
		String fullName = sc.nextLine();
		
		System.out.print("Enter dateOfbirth: ");
		int dateOfbirth = Integer.parseInt(sc.nextLine());
		
		Random rd = new Random();
		String[] str_temp = {"a", "b", "c", "d"};
		String id = str_temp[rd.nextInt(str_temp.length)] + (rd.nextInt(4)+1);
		
		Student item = new Student(id, fullName, dateOfbirth);
//		item.setId(id);
//		item.setFullName(fullName);
//		item.setDateOfbirth(dateOfbirth);
		
		return item;
	}
	
	
	
}
