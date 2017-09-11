package bai01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// compiler error
		/*
		 * int a = "5"; float b = 5c;
		 */

		// phép chia cho 0
		/*int a = 2;
		int b = 0;
		try {
			// đặt lệch có khả năng xảy ra ngoại lệ ở đây
			System.out.println("a/b + " + a / b);
			System.out.println("Im here :)) !!!");

		} catch (ArithmeticException e) {
			// xử lý khi gặp lỗi
			System.out.println("Error :((");
		}*/
		
		//Lỗi thực thi - RuntimeException => Unchecked
		//ArrayIndexOutOfBoundsException : chỉ số mảng ngoài giới hạn
		/*int[] a = new int[2];
		for(int i = 0; i < 10; i++){
			a[i] = 6;
		}*/
		
		//NullPointerException : đối tượng rỗng
		/*int[] b = null;
		for(int i = 0; i < 10; i++){
			b[i] = 6;
		}
		
		System.out.println("===========");
		
		Ex02 a = null;
		a.demo();*/
		
		//Mở file k tồn tại trong hệ thống
		//CompileException => Checked
		try {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(new File("bkit.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
}

class Ex001{
	public void demo(){
		System.out.println("demo");
	}
}
