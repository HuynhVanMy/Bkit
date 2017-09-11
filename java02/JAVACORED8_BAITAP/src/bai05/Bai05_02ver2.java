package bai05;

public class Bai05_02ver2 {

	public static void main(String[] args) {

		Bai05_02ver2 item = new Bai05_02ver2();
		String s = "Lập 3 #%^!* JavaCore 1";
		int countLet = item.countLetter(s);
		int count = item.countKytu(s);
		System.out.println("Chữ cái: " + countLet);
		System.out.println("ký tự đặt biệt: " + count);

	}

	// chữ
	public int countLetter(String s) {
		int countLet = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				countLet++;
			}
		}
		return countLet;
	}

	// kí tự đặt biệt
	public int countKytu(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isLetter(s.charAt(i)) && !Character.isDigit(s.charAt(i))
					&& !Character.isWhitespace(s.charAt(i))) {
				count++;
			}
		}
		return count;
	}

}
