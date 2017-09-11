package kiemtra;

import java.util.Random;

public class PtYNgua {

	public static void main(String[] args) {

		PtYNgua item = new PtYNgua();
		int[][] A = new int[3][3];
		item.input(A);
		item.output(A);
		item.arr(A);
	}

	public int[][] input(int[][] A) {
		Random random = new Random();
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				A[i][j] = random.nextInt(19) + 1;
			}
		}
		return A;
	}

	public void output(int[][] A) {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void arr(int[][] A) {	// hạn chế trả về void để khi cần có thể dùng đến => return về giá trị
		int b = 0;
		int c = 0;
		int[] B = new int[A.length];
		do {
			for (int i = 0; i < A.length; i++) {
				B[i] = A[i][b];
			}
			int max = max(B);
			System.out.println("max của cột " + (b + 1) + " là: " + max);

			int[] C = new int[A[0].length];
			for (int i = 0; i < A.length; i++) {
				for (int j = 0; j < A[i].length; j++) {
					C[j] = A[c][j];
				}
			}
			int min = min(C);

			System.out.println("min của hàng " + (c + 1) + " là: " + min);
			b++;
			c++;
		} while (b < A.length && c < A.length);
	}
	
	public int[] arrMax(int[][] A){
		int [] B = new int[A.length];
		for(int i = 0; i < A.length; i++){
			for(int j = 0; j < A[i].length; j++){
				
			}
		}
		
		return B;
	}

	public int max(int[] B) {
		int max = B[0];
		for (int i = 0; i < B.length; i++) {
			if (B[i] > max) {
				max = B[i];
			}
		}
		return max;
	}

	public int min(int[] C) {
		int min = C[0];
		for (int i = 0; i < C.length; i++) {
			if (C[i] < min) {
				min = C[i];
			}
		}
		return min;
	}
	
	//in ra vị trí của max, min và gán max, min = 0;
	
}
