package bai05_n_omvc;

public class Demo {
	public static void main(String[] args) {
		Account item = new Account("Huỳnh Văn Mỹ", "01658754028", "huynhvanmy028@gmail.com");
		boolean checkMain = true;
		do {
			int n = item.menu();
			switch (n) {
			case 1:
				System.out.println(item);
				break;
			case 2:
				item.setBalance(item.deposit());
				item.thongTinTK();
				break;
			case 3:
				item.setBalance(item.withdraw());
				item.thongTinTK();
				break;
			case 4:
				checkMain = false;
				break;
			}
		} while (checkMain);
		
		System.out.println("========THANK YOU. SEE YOU AGAIN=========");
		
	}
}
