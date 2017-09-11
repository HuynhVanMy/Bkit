package bai02;

import java.util.Scanner;

public class ReadNumber {
	public static final String MUOIF = " MƯỜI ";
	public static final String MUOI = " MƯƠI ";
	public static final String LAM = " LĂM ";
	public static final String TRAM = " TRĂM ";
	public static final String LE = "LẺ ";
	public static final String MOTS = "MỐT";

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ip = new Scanner(System.in);
		while (true) {
			System.out.print("Input N: ");
			int n = Integer.parseInt(ip.nextLine());
			System.out.println("Result : " + read3SO(n));
		}

	}

	private static String docTungSo(int singleNumber) {
		String value = "";
		switch (singleNumber) {
		case 0:
			value = "KHÔNG";
			break;
		case 1:
			value = "MỘT";
			break;
		case 2:
			value = "HAI";
			break;
		case 3:
			value = "BA";
			break;
		case 4:
			value = "BỐN";
			break;
		case 5:
			value = "NĂM";
			break;
		case 6:
			value = "SÁU";
			break;
		case 7:
			value = "BẢY";
			break;
		case 8:
			value = "TÁM";
			break;
		case 9:
			value = "CHÍN";
			break;
		}
		return value;
	}

	private static String read3SO(int input) {
		int SHT = input / 100;
		int SHC = input / 10 % 10;
		int SHDV = input - input / 10 * 10;

		if (input < 10) {
			// [0-9]
			return docTungSo(input);
		} else if (input < 100) {
			// [10-99]
			if (input % 10 == 0) {
				// [10-20->90]
				if (input == 10) {
					return MUOIF;
				} else {
					return docTungSo(input / 10) + MUOI;
				}
			} else {
				// [11->99]
				if (input < 20) {
					// [11-19]
					if (end5(input)) {
						return MUOIF + LAM;
					} else {
						return MUOIF + docTungSo(input % 10);
					}
				} else {
					if (end5(input)) {
						return docTungSo(input / 10) + MUOI + LAM;
					} else if (input % 10 == 1) {
						return docTungSo(input / 10) + MUOI + MOTS;
					} else {
						return docTungSo(input / 10) + MUOI + docTungSo(input % 10);
					}
				}
			}
		} else if (input < 1000) {
			// 100-999
			if (input % 10 == 0) {
				// Tận cùng = 0
				if (input % 100 == 0) {
					// [100-200->900]
					return docTungSo(input / 100) + TRAM;
				} else {
					// [110 -210 - 310]
					if (input / 10 % 10 == 1) {
						return docTungSo(input / 100) + TRAM + LE + MUOIF;
					} else {
						return docTungSo(input / 100) + TRAM + docTungSo(input / 10 % 10) + MUOI;
					}
				}
			} else {
				// Tận cùng != 0
				if (input / 10 % 10 == 0) {
					// Lấy hàng chục xem có bằng 0 ?[101-202-909]
					return docTungSo(input / 100) + TRAM + LE + docTungSo(input - input / 10 * 10);
				} else if ((input / 10 % 10 == 1)) {
					// 112 : 219
					if (end5(input)) {
						return docTungSo(input / 100) + TRAM + MUOIF + LAM;
					} else {
						return docTungSo(input / 100) + TRAM + MUOIF + docTungSo(input - input / 10 * 10);
					}
				} else {
					// [121-999] except some Exceptions case

					if (end5(input)) {
						// Tận cùng là số 5
						return docTungSo(input / 100) + TRAM + docTungSo(input / 10 % 10) + MUOI + LAM;
					} else if (SHDV == 1) {
						return docTungSo(input / 100) + TRAM + docTungSo(input / 10 % 10) + MUOI + MOTS;
					} else {
						return docTungSo(input / 100) + TRAM + docTungSo(input / 10 % 10) + MUOI
								+ docTungSo(input - input / 10 * 10);
					}
				}
			}

		}
		return "";
	}

	public static boolean end5(int a) {
		if (a % 10 == 5) {
			return true;
		}
		if (a % 100 == 5) {
			return true;
		}
		return false;

	}
}
