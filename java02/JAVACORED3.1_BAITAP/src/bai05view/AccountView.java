package bai05view;

import bai05bean.AccountMVC;
import bai05controller.AccountController;

public class AccountView {
	public static void main(String[] args) {
		AccountController controller = new AccountController();
		AccountMVC item = new AccountMVC("Huỳnh Văn Mỹ", "01658754028", "huynhvanmy028@gmail.com");
		boolean checkMain = true;
		do {
			int n = controller.menu();
			switch (n) {
			case 1:
				System.out.println(item.toString());
				break;
			case 2:
				item = controller.deposit(item);
				controller.thongTinTK(item);
				break;
			case 3:
				item = controller.withdraw(item);
				controller.thongTinTK(item);
				break;
			case 4:
				checkMain = false;
				break;
			}
		} while (checkMain);
		
		System.out.println("========THANK YOU. SEE YOU AGAIN=========");
	}
}
