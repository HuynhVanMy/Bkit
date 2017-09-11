package bai05;

public class Bai5_01 {

	public static void main(String[] args) {
		String s = "Lập trình 3 JavaCore 1 ";
		int so = 0;
		int chuHoa = 0;
		int space = 0;
		int chuThuong = 0;
		for (int i = 0; i < s.length(); i++) {
			if (String.valueOf(s.charAt(i)).matches(".*[0-9].*")) {
				so++;
			} else if (String.valueOf(s.charAt(i)).matches(".*[A-Z].*")) {
				chuHoa++;
			} else if (String.valueOf(s.charAt(i)).matches(".*\\s.*")) {
				space++;
			}
		}
		chuThuong = s.length() - (so + chuHoa + space);
		System.out.println(so);
		System.out.println(chuHoa);
		System.out.println(chuThuong);
	}

}
