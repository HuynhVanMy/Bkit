package bai04;

import java.util.Scanner;

public class EmailException {

	public String inputData() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String email = "";
		boolean check = true;
		do {
			try {
				System.out.print("Nhập email: ");
				email = sc.nextLine();
				check = false;
				checkMail(email);
			} catch (Exception ex) {
				check = true;
				System.out.println("Nhập mail k đúng định dạng !!!");

			}
		} while (check);

		return email;
	}

	public void checkMail(String s) throws Exception {
		if (!s.matches("[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z]+)*(\\.[A-Za-z]{2,})$")) {
			throw new Exception();
		}
	}

}
