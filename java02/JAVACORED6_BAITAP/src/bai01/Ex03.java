package bai01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		try {
			demoThrow(5, 6);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void demoThrow(int a, int b) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("bksait.txt"));
	}
}

class A {
	public static void demo() {
		System.out.println("uhuhuh");
	}
}
