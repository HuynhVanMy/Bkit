package ex01;

public class Ex01 {

	public static void main(String[] args) {
		String s = "012345675895";
		String s2 = s.substring(0, 8);
		System.out.println(s.indexOf("5", s.indexOf("5") + 1));
		System.out.println(s2);
	}

}
