package baitap;

public class Ex01 {
	public static void main(String[] args) {
		int n = 8;
		//int[] arr = new int[20];
		//ChuyenDoi(n, arr);
		
		String s = null;
		s = ChuyenDoi02(n, s);
		System.out.println(s);
		s = new StringBuffer(s).reverse().toString();
		System.out.println(s);
	}

	public static void ChuyenDoi(int n, int[] arr) {
		int Count = 0;
		while (n != 0) {
			int temp = n % 2;
			if (temp == 0) {
				arr[Count] = 0;
			} else {
				arr[Count] = 1;
			}
			Count++;
			n /= 2;
		}
		for (int i = Count - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}

	public static String ChuyenDoi02(int n, String s) {
		s = "";
		while (n != 0) {
			int temp = n % 2;
			s += temp;
			n /= 2;
		}
		return s;
	}
}
