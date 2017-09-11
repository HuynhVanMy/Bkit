package bai02;

public class Bai02 {
	public static void main(String[] args) {
		
		int n = 0;
		n = Result(n);
		System.out.println(n);
		
	}
	
	public static int Result(int n){
		int Count = 0; // Biến đếm áp dụng trong vòng lặp do while
		n = 1; // bắt đầu từ 1
		do {
			if (KTSoNgTo(n)) {
				Count++;
			}
			n++;
		} while (Count < 200);
		return n-1;
		/*
		 * return về n - 1 vì trc khi kết thúc vòng lặp thì n đã tăng lên 1 đơn vị
		 */
	}

	// Kiểm tra số nguyên tố
	public static boolean KTSoNgTo(int a) {
		if (a < 2) {
			return false;
		} else if ( a == 2) {
			return true;
		} else {
			for (int i = 2; i < a; i++) {
				if (a % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
