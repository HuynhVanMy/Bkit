package bai05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReadNumberAdv {
	public static final String KHONG = "KHÔNG";
	public static final String MOT = "MỘT";
	public static final String HAI = "HAI";
	public static final String BA = "BA";
	public static final String BON = "BỐN";
	public static final String NAM = "NĂM";
	public static final String SAU = "SÁU";
	public static final String BAY = "BẢY";
	public static final String TAM = "TÁM";
	public static final String CHIN = "CHÍN";
	public static final String LAM = "LĂM";
	public static final String LE = "LẺ";
	public static final String MUOI = "MƯƠI";
	public static final String MUOIF = "MƯỜI";
	public static final String MOTS = "MỐT";
	public static final String TRAM = "TRĂM";
	public static final String NGHIN = "NGHÌN";
	public static final String TRIEU = "TRIỆU";
	public static final String TY = "TỶ";
	// http://diendan.congdongcviet.com/threads/t220383::chuong-trinh-doc-so-thanh-chu-doc-moi-so-thanh-chu-de-tinh-tien.cpp
	public static final String[] number = { KHONG, MOT, HAI, BA, BON, NAM, SAU, BAY, TAM, CHIN };

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner ip = new Scanner(System.in);
		int n = 0;
		boolean check = false;
		System.out.print("Input N: ");
		do {
			try {
				n = Integer.parseInt(ip.nextLine());
				check = false;
				if (n < 0) {
					System.out.println("Input N > 0 !!");
					check = true;
				}
			} catch (NumberFormatException ex) {
				check = true;
			}
		} while (check);

		ArrayList<String> kq = readNum(n);
		for (int i = 0; i < kq.size(); i++) {
			System.out.print(kq.get(i) + " ");
		}

	}

	// Hàm chính đọc số
	public static ArrayList<String> readNum(int ip) {
		ArrayList<String> kq = new ArrayList<String>();
		String number = Integer.toString(ip);

		// Cắt chuổi string chử số ra thành các chuổi nhỏ 3 chử số
		ArrayList<String> List_Num = Split(number, 3);
		
		// Nháp Console list cụm 3 số.
		for(int i=0;i<List_Num.size() ;i++){
			System.out.println((i+1)+ ": " + List_Num.get(i));
		}
		// abc(trăm) def(chục) ghk(đơn vị)
		// List_Num => Số dãy
		while (List_Num.size() != 0) {
			// Xét 3 số đầu tiên của chuổi (số đầu tiên của List_Num) 3
			switch (List_Num.size() % 3) {
				// 3 số đó thuộc hàng trăm
				case 1:
					kq.addAll(read_3num(List_Num.get(0)));
					break;
				// 3 số đó thuộc hàng nghìn
				case 2:
					ArrayList<String> nghin = read_3num(List_Num.get(0));
					if (!nghin.isEmpty()) {
						kq.addAll(nghin);
						kq.add(NGHIN);
					}
					break;
				// 3 số đó thuộc hàng triệu
				case 0:
					ArrayList<String> trieu = read_3num(List_Num.get(0));
					if (!trieu.isEmpty()) {
						kq.addAll(trieu);
						kq.add(TRIEU);
					}
					break;
			}

			// Xét nếu 3 số đó thuộc hàng tỷ
			if (List_Num.size() == (List_Num.size() / 3) * 3 + 1 && List_Num.size() != 1)
				kq.add(TY);

			// Xóa 3 số đầu tiên để tiếp tục 3 số kế
			List_Num.remove(0);
		}

		return kq;
	}

	// Đọc 3 số
	public static ArrayList<String> read_3num(String a) {
		ArrayList<String> kq = new ArrayList<String>();
		int num = -1;
		try {
			num = Integer.parseInt(a);
		} catch (Exception ex) {
		}
		if (num == 0)
			return kq;

		int hang_tram = -1;
		try {
			hang_tram = Integer.parseInt(a.substring(0, 1));
		} catch (Exception ex) {
		}
		int hang_chuc = -1;
		try {
			hang_chuc = Integer.parseInt(a.substring(1, 2));
		} catch (Exception ex) {
		}
		int hang_dv = -1;
		try {
			hang_dv = Integer.parseInt(a.substring(2, 3));
		} catch (Exception ex) {
		}

		// xét hàng trăm
		if (hang_tram != -1) {
			kq.add(number[hang_tram]);
			kq.add(TRAM);
		}

		// xét hàng chục
		switch (hang_chuc) {
		case -1:
			break;
		case 1:
			kq.add(MUOIF);
			break;
		case 0:
			if (hang_dv != 0)
				kq.add(LE);
			break;
		default:
			kq.add(number[hang_chuc]);
			kq.add(MUOI);
			break;
		}

		// xét hàng đơn vị
		switch (hang_dv) {
		case -1:
			break;
		case 1:
			if ((hang_chuc != 0) && (hang_chuc != 1) && (hang_chuc != -1))
				kq.add(MOTS);
			else
				kq.add(number[hang_dv]);
			break;
		case 5:
			if ((hang_chuc != 0) && (hang_chuc != -1))
				kq.add(LAM);
			else
				kq.add(number[hang_dv]);
			break;
		case 0:
			if (kq.isEmpty())
				kq.add(number[hang_dv]);
			break;
		default:
			kq.add(number[hang_dv]);
			break;
		}
		return kq;
	}

	public static ArrayList<String> Split(String numberStr, int chunkSize) {
		// let's chuckSize=3
		int du = numberStr.length() % chunkSize;
		// Nếu độ dài chuổi không phải bội số của chunkSize thì thêm # vào trước => Bộ 3
		if (du != 0)
			for (int i = 0; i < (chunkSize - du); i++)
				numberStr = "#" + numberStr;
		return splitStringEvery(numberStr, chunkSize);
	}

	// Split string after add # character: interval-chunkSize
	public static ArrayList<String> splitStringEvery(String numberStr, int interval) {
		ArrayList<String> arrList = new ArrayList<String>();
		int arrayLength = (int) Math.ceil(((numberStr.length() / (double) interval)));
		String[] result = new String[arrayLength];
		int j = 0;
		int lastIndex = result.length - 1;
		for (int i = 0; i < lastIndex; i++) {
			result[i] = numberStr.substring(j, j + interval);
			j += interval;
		}
		result[lastIndex] = numberStr.substring(j);

		/*
		 * Có thể dùng hàm sau để cắt nhưng hiệu suất sẽ thấp hơn cách trên
		 * Sử dụng biếu thức chính quy
		 * result = s.split("(?<=\\G.{" + interval + "})");
		 */
		arrList.addAll(Arrays.asList(result));
		return arrList;
	}

}
