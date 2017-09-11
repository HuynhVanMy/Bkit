package view;

public class Ex01 {

	public static void main(String[] args) {
		// phép toán chia cho 0.
		int a = 5;
		int b = 0;
		try {
			// đặt lệnh có khả năng xảy ra lỗi
			System.out.println("a/b:" + a / b);
			System.out.println("AAAAA");
		} catch (ArithmeticException e) {
			System.out.println("BB");
			// xử lý
		}
	}

}
