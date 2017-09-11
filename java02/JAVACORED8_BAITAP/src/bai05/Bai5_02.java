package bai05;

public class Bai5_02 {

	public static void main(String[] args) {
		Bai5_02 item = new Bai5_02();
		String s = "Lập 3 #%^!* JavaCore 1";

		char[] A = s.toCharArray();

		int kytu = item.kytu(A);
		int so = item.so(A);
		int space = item.space(A);
		int chuHoa = item.chuHoa(A);
		int chuThuong = item.chuThuong(A);

		System.out.println("Chuỗi có " + s.length() + " kí tự !!!");
		item.output(kytu, so, space, chuHoa, chuThuong);

	}

	public void output(int kytu, int so, int space, int chuHoa, int chuThuong) {
		System.out.println("Trong đó:");
		System.out.println(chuHoa + " chữ hoa.");
		System.out.println(chuThuong + " chữ thường.");
		System.out.println(kytu + " ký tự đặt biệt.");
		System.out.println(so + " chữ số.");
		System.out.println(space + " khoảng trắng.");
	}

	public int chuThuong(char[] A) {
		return A.length - (so(A) + kytu(A) + space(A) + chuHoa(A));
	}

	public int so(char[] A) {
		int so = 0;
		char[] C = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < C.length; j++) {
				if (C[j] == A[i]) {
					so++;
				}
			}
		}
		return so;
	}

	public int kytu(char[] A) {
		int kytu = 0;
		char[] B = { '!', '@', '#', '$', '%', '^', '&', '*', '(', ')' };
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if (B[j] == A[i]) {
					kytu++;
				}
			}
		}
		return kytu;
	}

	public int space(char[] A) {
		int space = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == ' ') {
				space++;
			}
		}
		return space;
	}

	public int chuHoa(char[] A) {
		int chuHoa = 0;
		for (int i = 0; i < A.length; i++) {
			if (Character.isUpperCase(A[i])) {
				chuHoa++;
			}
		}
		return chuHoa;
	}

}
