package bai01;

public class MathLib {

	public static void main(String[] args) {
		System.out.println("Max : " + Math.max(Math.max(6, 9), 6));
		System.out.println(Math.ceil(5.6)); // làm tròn trên
		System.out.println(Math.floor(5.6)); // làm tròn dưới
	}

	//ko cần dùng nữa vì có hàm max của lib rồi :))
	public int max(int a, int b, int c) {
		return (a > b ? a : b) > c ? (a > b ? a : b) : c;
	}

}
