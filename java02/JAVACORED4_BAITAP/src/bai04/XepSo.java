package bai04;

import java.util.Scanner;

public class XepSo {
	public static void main(String[] args) {
		XepSo obj = new XepSo();
		int n; // độ dài mảng
		System.out.print("Nhập số lượng phần tử: ");
		n = obj.batLoiNhap();

		int[] A = new int[n];

		obj.inputArray(A);
		System.out.println("---Dãy số vừa nhập---");
		obj.ouputArray(A);
		int[] B = obj.sapXep(A);
		System.out.println("\n--Dãy số sau khi sắp xếp--");
		obj.ouputArray(B);

	}

	// nhập mảng số
	public int[] inputArray(int[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.print("Nhập phần tử thứ " + i + ": ");
			A[i] = batLoiNhap();
		}
		return A;
	}

	// xuất mảng
	public int[] ouputArray(int[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + "  ");
		}
		return A;
	}

	// sắp xếp lại mảng
	public int[] sapXep(int[] A) {
		int[] B = new int[A.length];
		int b = A.length - 1;	// để xếp các số vào cuối dãy
		int temp = 0;			//để xếp các số vào đầu dãy
		/*
		 * nạp số chia hết cho 7 vào đầu mảng
		 *  nạp số chia hết cho 5 vào cuối mảng
		 *   nạp các số còn lại vào giữa ưu tiên số vừa chia hết cho 5 và 7 nằm về nửa đầu của mảng
		 */
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 7 == 0 && A[i] % 5 != 0) {
				B[temp++] = A[i];
			} else if (A[i] % 5 == 0 && A[i] % 7 != 0) {
				B[b--] = A[i];
			}
		}
		for (int i = 0; i < A.length; i++) {

			if (A[i] % 7 == 0 && A[i] % 5 == 0) {
				B[temp++] = A[i];
			} else if (A[i] % 7 != 0 && A[i] % 5 != 0) {
				B[b--] = A[i];
			}
		}
		return B;
	}

	// bắt lỗi phần tử nhập vào
	public int batLoiNhap() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean checkBug = true;
		do {
			try {
				n = Integer.parseInt(sc.nextLine());
				checkBug = false;
			} catch (NumberFormatException ex) {
				System.out.println("không đc nhập bậy !");
				checkBug = true;
			}
		} while (checkBug);
		return n;
	}

}
