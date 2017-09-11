package libraries;

public class Mathlib {

	public static void main(String[] args) {
		System.out.println("Max : " + Math.max(Math.max(5, 7), 9));
		Math.ceil(5.6);	//làm tròn trên
		Math.floor(5.6);	//làm tròn dưới
	}

	public int max(int a, int b, int c) {
		return (a > b ? a : b) > c ? (a > b ? a : b) : c;
	}

}
