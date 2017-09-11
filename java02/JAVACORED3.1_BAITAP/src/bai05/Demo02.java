package bai05;

public class Demo02 {
	public static void main(String[] args) {
		Account item02 = new Account("Huỳnh Văn Mỹ", "01658754028", "huynhvanmy028@gmail.com");
		boolean checkMain = true;
		do {
			int n = item02.menu();
			switch (n) {
			case 1:
				System.out.println(item02);
				break;
			case 2:
				item02.setBalance(item02.deposit02(1000000));
				item02.thongTinTK();
				break;
			case 3:
				item02.setBalance(item02.withdraw02(100000));
				item02.thongTinTK();
				break;
			case 4:
				checkMain = false;
				break;
			}
		} while (checkMain);
		
		System.out.println("========THANK YOU. SEE YOU AGAIN=========");
		
	}
}
