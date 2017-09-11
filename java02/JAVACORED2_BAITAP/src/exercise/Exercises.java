package exercise;

public class Exercises {

	public static void main(String[] args) {
		Exercises obj = new Exercises();

		// Hình a
		obj.HinhA();
		System.out.println();
		// Hình b
		obj.HinhB();
		System.out.println();
		// Hình c
		obj.HinhC();
		System.out.println();
		// Hình d
		obj.HinhD();
		System.out.println();
		// Hình e
		obj.HinhE();
		System.out.println();
		// Hình f
		obj.HinhF();
		System.out.println();
		// Hình g
		obj.HinhG();
		System.out.println();
		// Hình h
		obj.HinhH();
		System.out.println();
		// Hình i
		obj.HinhI();
		System.out.println();
		// Hình j
		obj.HinhJ();
		System.out.println();
		// Hình k
		obj.HinhK();
		System.out.println();

		// Hình l
		obj.HinhL();
		System.out.println();

		// Hình m
		obj.HinhM();
		System.out.println();
		// Hình n
		obj.HinhN();
		System.out.println();
		// Hình O
		obj.HinhO();
		System.out.println();
		// Hình p
		obj.HinhP();

	}

	// Hình a
	public void HinhA() {
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}

	// Hình b
	public void HinhB() {

		for (int i = 8; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("# ");
			}
			System.out.println("  ");
		}
	}

	// Hình C
	public void HinhC() {
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				if (j < i) {
					System.out.print("  ");
				} else {
					System.out.print("# ");
				}
			}
			System.out.println();
		}
	}

	// Hình D
	public void HinhD() {
		for (int i = 8; i >= 1; i--) {
			for (int j = 1; j <= 8; j++) {
				if (j < i) {
					System.out.print("  ");
				} else {
					System.out.print("# ");
				}
			}
			System.out.println();
		}
	}

	// Hình E
	public void HinhE() {
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i == 1 || i == 7) {
					System.out.print("# ");
				} else if (j > 1 && j < 7) {
					System.out.print("  ");
				} else {
					System.out.print("# ");
				}
			}
			System.out.println();
		}
	}

	/// Hình F
	public void HinhF() {
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i == 1 || i == 7) {
					System.out.print("# ");
				} else if (j == i) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	// Hình G
	public void HinhG() {
		for (int i = 7; i >= 1; i--) {
			for (int j = 1; j <= 7; j++) {
				if (i == 1 || i == 7) {
					System.out.print("# ");
				} else if (j == i) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	// Hình H
	public void HinhH() {
		for (int i = 0; i <= 6; i++) {
			for (int j = 0; j <= 6; j++) {
				if (i == 0 || i == 6) {
					System.out.print("# ");
				} else if (j == i || j == 6 - i) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	// Hình I
	public void HinhI() {
		int temp = 0;
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i == 1 || i == 7) {
					System.out.print("# ");
				} else if (j == 1 || j == 7 || j == i || j == 7 - temp) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			temp++;
			System.out.println();
		}
	}

	// Hình J
	public void HinhJ() {
		int temp = 0;
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 11; j++) {
				if (i == 1) {
					System.out.print("# ");
				} else if (j >= i && j <= 11 - temp) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			temp++;
			System.out.println();
		}
	}

	// Hình K
	public void HinhK() {
		int temp = 5;
		for (int i = 6; i >= 1; i--) {
			for (int j = 1; j <= 11; j++) {
				if (i == 1) {
					System.out.print("# ");
				} else if (j < i || j > 11 - temp) {
					System.out.print("  ");
				} else {
					System.out.print("# ");
				}
			}
			temp--;
			System.out.println();
		}
	}

	// Hình L
	public void HinhL(){
		int n = 11;
		int t = 5;
		for (int i = 1; i <= 11; i++) {
			for (int j = 0; j < n; j++) {
				if (i > 6) {
					if (j < (n / 2) + t && j > (n / 2) - t) {
						System.out.print("# ");
					} else {
						System.out.print("  ");
					}
				} else if (j < (n / 2) + i && j > (n / 2) - i) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			if(i>6){
				t--;
			}
			System.out.println();
		}
	}
	// Hình M
	public void HinhM() {
		for(int i = 1; i <= 8; i++){
			for(int j = 1; j <= 8; j++){
				if(j<=i){
					System.out.print(j+ " ");
				}
			}
			System.out.println();
		}
	}

	// Hình N
	public void HinhN() {
		int n = 7;
		int m = 0;
		for (int i = 8; i >= 1; i--) {
			for (int j = 1; j <= 8; j++) {
				if (j >= i - n) {
					System.out.print((j - m) + " ");
				} else {
					System.out.print("  ");
				}
			}
			n -= 2;
			m++;
			System.out.println();
		}
	}

	// Hình O
	public void HinhO() {
		for (int i = 1; i <= 8; i++) {
			for (int j = 8; j >= 1; j--) {
				if (j <= i) {
					System.out.print(j + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	// Hình P
	public void HinhP() {
		for (int i = 0; i < 8; i++) {
			for (int j = 8 - i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
