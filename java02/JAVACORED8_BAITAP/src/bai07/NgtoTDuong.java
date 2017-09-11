package bai07;

import java.util.Scanner;

public class NgtoTDuong {

	public static void main(String[] args) {

		NgtoTDuong item = new NgtoTDuong();
		String strA = item.validInput("A");
		String strB = item.validInput("B");
		item.output(item.toInt(strA), item.toInt(strB));

	}

	public long toInt(String str) {
		int tempInt = 0;
		long tempLong = 0;
		try {
			tempInt = Integer.parseInt(str);
			return tempInt;
		} catch (Exception e) {
			tempLong = Long.parseLong(str);
			return tempLong;
		}
	}

	public String validInput(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String strA = "";
		boolean matches = false;
		while (!matches) {
			System.out.print("Input number " + s + ": ");
			strA = sc.nextLine();
			matches = strA.matches("[0-9]+");
		}
		return strA;
	}

	public void output(long m, long n) {
		long min = m < n ? m : n;
		int count = 0;
		for (int i = 1; i <= min; i++) {
			if (isPrime(i)) {
				if (m % i == 0 && n % i == 0) {
					count++;
					System.out.println(i);
				}
			}
			if (count >= 2) {
				System.out.println("YES");
				break;
			}
		}
		if (count < 2) {
			System.out.println("NO");
		}

	}

	public boolean isPrime(long n) {

		if (n < 2) {
			return false;
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}

		return true;
	}

}
