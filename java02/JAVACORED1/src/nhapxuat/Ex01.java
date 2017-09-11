package nhapxuat;

import java.util.Scanner;

public class Ex01 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Input s0: ");
		String s0 = sc.nextLine();
		
		System.out.print("Input a0: ");
		int a0 = sc.nextInt();
		
		System.out.print("Input b0: ");
		float f0 = sc.nextFloat();
		
		System.out.print("Input s1: ");
		String s1 = sc.nextLine();
		s1 = sc.nextLine();// tìm hiểu lại
		
		System.out.print("Input s2: ");
		String s2 = sc.nextLine();
		
		System.out.println("s0: " + s0
						+ "\na0: " + a0
						+ "\nb0: " + f0
						+ "\ns1: "+s1
						+ "\ns2: "+s2
						);
	}
}
