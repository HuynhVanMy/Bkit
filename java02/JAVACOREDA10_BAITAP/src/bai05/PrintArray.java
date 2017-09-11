package bai05;

public class PrintArray {

	public static void main(String[] args) {
		PrintArray item = new PrintArray();
		int[] A = { 1, 2, 3, 4, 5, 3, 4, 3, 2 };
		System.out.println(item.newArr(A));
	}

	// trả về kiểu String
	public String newArr(int[] A) {
		String s = "";
		for (int i = 0; i < A.length; i++) {
			if (checkElement(A, i, A[i])) {
				s += A[i] + " ";
			}
		}
		return s;

	}

	// kiểm tra phần tử lặp trong mảng
	public boolean checkElement(int[] A, int k, int n) {
		for (int i = 0; i < k; i++) {
			if (n == A[i]) {
				return false;
			}
		}
		return true;
	}

}
