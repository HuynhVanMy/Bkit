package bai05;

public class Bai05_01ver2 {

	public static void main(String[] args) {
		Bai05_01ver2 item = new Bai05_01ver2();
		String s = "Lập trình 3 JavaCore 1 ";
		int countNum = item.countNumber(s);
		int countLet = item.countLetter(s);
		int countUp = item.countLetterUp(s);
		int countLow = countLet - countUp;
		System.out.println("số: " + countNum);
		System.out.println("chữ thường: " + countLow);
		System.out.println("chữ hoa: " + countUp);
	}

	// số
	public int countNumber(String s) {
		int countNum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				countNum++;
			}
		}
		return countNum;
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

	// chữ hoa
	public int countLetterUp(String s) {
		int countUp = 0;
		for (int i = 0; i < s.length(); i++) {

			if (Character.isUpperCase(s.charAt(i))) {
				countUp++;
			}
		}
		return countUp;
	}

}
