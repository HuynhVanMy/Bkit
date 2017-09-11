package javacored8;

import java.util.Scanner;

public class InKyTuTheoYeuCauBai03 {

	public static void main(String[] args) {
		InKyTuTheoYeuCauBai03 item = new InKyTuTheoYeuCauBai03();
		String name = item.inputName();
		name = item.uppcaseChar(name);
		System.out.println(name);

	}

	// input name
	public String inputName() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String name = "";
		boolean check = true;
		do {
			try {
				System.out.print("Enter your name: ");
				name = sc.nextLine();
				check = false;
				if (!checkName(name)) {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("Nonsense !!!");
				check = true;
			}
		} while (check);
		name = deletewithspace(name);
		return name;
	}

	public String uppcaseChar(String name) {
		String temp = "";
		for (int i = 0; i < name.length(); i++) {
			if (i == 0) {
				temp += String.valueOf(name.charAt(i)).toUpperCase();
			} else if (name.charAt(i - 1) == ' ') {
				temp += String.valueOf(name.charAt(i)).toUpperCase();
			} else {
				temp += String.valueOf(name.charAt(i)).toLowerCase();
			}
		}
		return temp;
	}

	// delete withspace dư thừa
	public String deletewithspace(String name) {
		name = name.trim();
		name = name.replaceAll("\\s+", " ");
		return name;
	}

	public boolean checkName(String name) {
		if (name.matches(".*[0-9].*")) {
			return false;
		}
		return true;
	}

}
