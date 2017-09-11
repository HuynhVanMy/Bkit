package overloading;

public class OverLoad {
	public static void main(String[] args) {
		calSum();
		calSum(6, 8);
		calSum(1, 2, 3);

	}
	
	private static int calSum() {
		return 5 + 7;
	}

	private static int calSum(int a, int b) {
		return a + b;
	}

	private static int calSum(int a, int b, int c) {
		return a + b + c;
	}

}
