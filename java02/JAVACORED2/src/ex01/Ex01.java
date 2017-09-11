package ex01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		//resource warning
		Scanner sc = new Scanner(System.in);
		System.out.print("Input s0: ");
		String s0 = sc.nextLine();
		
		System.out.print("Input a0: ");
		int a0 = Integer.parseInt(sc.nextLine());
		
		System.out.print("Input f0: ");
		float f0 = Float.parseFloat(sc.nextLine());
		
		System.out.print("s0: "+s0
							+"\na0: "+a0
							+"\nb0: "+f0);
		
		sc.close();
	}
}
