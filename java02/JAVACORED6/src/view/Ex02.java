package view;

public class Ex02 {
	public static void main(String[] args) {

	}

	public int calDiv(int a, int b) {
		int result = 0;
		try {
			result = a / b;
		} catch (ArithmeticException ex) {
			
			System.out.println(ex.getMessage());
		}
		return result;
	}
}
