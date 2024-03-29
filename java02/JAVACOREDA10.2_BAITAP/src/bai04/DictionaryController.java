package bai04;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class DictionaryController {

	public int menu() {
		System.out.println("1. Thêm từ" + "\t2. Tra từ" + "\t3. In tất cả các từ đã có" + "\t4. Thoát");
		int n = checkNumer("lựa chọn");
		return n;
	}

	public void findDiction(TreeMap<String, Dictionary> dictionary) {
		String s = checkString("từ cần tìm");
		Set<String> listDictionary = dictionary.keySet();
		for (String item : listDictionary) {
			if (item.equalsIgnoreCase(s)) {
				System.out.println(item + dictionary.get(item));
			}
		}
	}

	public void output(TreeMap<String, Dictionary> dictionary) {
		Set<String> listDictionary = dictionary.keySet();
		for (String string : listDictionary) {
			System.out.println(string + dictionary.get(string));
		}
	}

	public TreeMap<String, Dictionary> addDictionary() {
		TreeMap<String, Dictionary> dictionary = new TreeMap<>();
		int n = checkNumer("số lượng từ cần thêm");
		for (int i = 0; i < n; i++) {
			String str = checkString("từ cần thêm");
			dictionary.put(str, inputData());
		}
		return dictionary;
	}

	public Dictionary inputData() {
		String nghia = checkString("nghĩa");
		String loaiTu = checkString("loại từ");
		String ghiChu = checkString("ghi chú");
		Dictionary item = new Dictionary(nghia, loaiTu, ghiChu);
		return item;
	}

	// kiểm tra kiểu số nhập vào
	public int checkNumer(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean check = true;
		do {
			try {
				System.out.print("Nhập " + s + ": ");
				n = Integer.parseInt(sc.nextLine());
				check = false;
				if (n < 0) {
					System.out.println("Không đc nhỏ hơn 0 !!!");
					check = true;
				}
			} catch (NumberFormatException e) {
				System.out.println("Nhập bậy !!!");
				check = true;
			}
		} while (check);
		return n;
	}

	// nhập chuỗi
	public String checkString(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str = "";
		System.out.print("Nhập " + s + ": ");
		str = sc.nextLine();
		return str;
	}

}
