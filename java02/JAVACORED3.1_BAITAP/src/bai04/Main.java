package bai04;

public class Main {
	public static void main(String[] args) {
		Vehicle item = new Vehicle();
		Vehicle xe1 = new Vehicle();
		Vehicle xe2 = new Vehicle();
		Vehicle xe3 = new Vehicle();

		boolean check = true;
		do {
			int choose = item.menu();
			switch (choose) {
			case 1:
				xe1.inputData("1");
				xe2.inputData("2");
				xe3.inputData("3");
				break;
			case 2:
				System.out.println("Tên Chủ Xe" + "\t" + "Loại Xe" + "\t\t" + "Dung Tích" + "\t" + "Trị Giá" + "\t\t"
						+ "Thuế Phải Nộp");
				System.out
						.println("==================================================================================");
				xe1.ouput();
				xe2.ouput();
				xe3.ouput();
				break;
			case 3:
				check = false;
				break;

			}

		} while (check);
		System.out.println("=========THE END========");
	}

}
