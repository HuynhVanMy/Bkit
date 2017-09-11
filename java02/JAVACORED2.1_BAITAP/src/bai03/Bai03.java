package bai03;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {

		int a = inputSize("A");
		String[] A = new String[a];
		inputData(A, a, "A");

		int b = inputSize("B");
		String[] B = new String[b];
		inputData(B, b, "B");

		System.out.print("\nMảng A: ");
		Xuat(A, a);

		System.out.print("\nMảng B: ");
		Xuat(B, b);

		String[] C = new String[a < b ? a : b];
		System.out.println("\nGiao: ");
		C = Giao(A, B, C);
		Xuat(C, C.length);

		System.out.println("\nHợp: ");
		String[] D = Hop(A, B);
		Xuat(D, D.length);

		System.out.println("\nHiệu:");
		String[] E = Hieu(A, B);
		Xuat(E, E.length);

	}

	// Nhập kích thước
	public static int inputSize(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean Check = true;
		do {
			try {
				System.out.print("Nhập số phần tử mảng " + s + " :");
				n = Integer.parseInt(sc.nextLine());
				Check = false;
			} catch (Exception ex) {
				System.out.println("Không đc nhập bậy !!!");
				Check = true;
			}
		} while (Check);
		return n;
	}

	// Nhập mảng
	public static void inputData(String[] arr, int n, String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mảng " + s);
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập tên thứ " + i + " :");
			arr[i] = sc.nextLine();
		}
	}

	// Xuất mảng
	public static void Xuat(String[] arr, int size) {
		for (int i = 0; i < size; i++) {
			if (arr[i] != null) { // dùng !arr[i].equals(null) thì bị lỗi
				System.out.print(arr[i] + " ");
			}
		}
	}

	// tìm giao
	public static String[] Giao(String[] A, String[] B, String[] C) {
		int c = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if (B[j].equals(A[i])) {
					C[c] = B[j];
					c++;
				}
			}
		}
		return C;
	}

	// Tìm hợp
	public static String[] Hop(String[] A, String[] B) {
		String[] D = new String[A.length + B.length];
		int d = 0;
		for (int i = 0; i < A.length; i++) {
			D[d++] = A[i];
		}
		for (int i = 0; i < B.length; i++) {
			if (check(B[i], D)) {
				D[d++] = B[i];
			}
		}

		return D;
	}

	// tìm hiệu A\B
	public static String[] Hieu(String[] A, String[] B) {
		String[] E = new String[A.length];
		int e = 0;
		for (int i = 0; i < A.length; i++) {
			if (check(A[i], B)) {
				E[e++] = A[i];
			}
		}
		return E;
	}

	// kiểm tra phần tử giống nhau
	public static boolean check(String a, String[] b) {
		for (int i = 0; i < b.length; i++) {
			if (a.equals(b[i])) {
				return false;
			}
		}
		return true;
	}

}
