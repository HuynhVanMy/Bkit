package bai04;

import java.util.Scanner;

public class Bai04 {

	public static void main(String[] args) {

		Bai04 item = new Bai04();
		String s = item.input();
		System.out.println(s);

		String[] arr = new String[20];
		item.xuliXau(arr);
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i + 1 != s.length()) {
				if (s.charAt(i) == s.charAt(i + 1)) {
					arr[j] += s.charAt(i);
				} else if (s.charAt(i) != s.charAt(i + 1)) {
					arr[j] += s.charAt(i);
					j++;
				}
			} else {
				arr[j] += s.charAt(i);
			}
		}
		System.out.println("---------------");
		System.out.println(item.maxStr(arr));

	}

	public void xuliXau(String[] arr) {
		for (int q = 0; q < arr.length; q++) {
			arr[q] = "";
		}
	}

	public String maxStr(String[] arr) {
		String max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > max.length()) {
				max = arr[i];
			}
		}
		return max;
	}

	public String input() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String s = "";
		boolean check = true;
		do {
			try {
				System.out.print("Nhập xâu S: ");
				s = sc.nextLine();
				check = false;
				if (!checkStr(s)) {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("Chỉ đc nhập các kí tự từ a đến z !!!");
				check = true;
			}
		} while (check);
		return s;
	}

	public boolean checkStr(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isLowerCase(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}
