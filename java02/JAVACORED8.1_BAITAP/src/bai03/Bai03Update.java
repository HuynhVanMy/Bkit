package bai03;

public class Bai03Update {

	public static void main(String[] args) {
		String str = "";
		int i = 1;
		int k = 30;
		while (str.length() <= k) {
			str += i++;
		}
		System.out.println(str);
		System.out.println(str.length());
		str = str.substring(0, str.length() - (str.length() - k));
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.charAt(str.length() - 1));

	}
}
