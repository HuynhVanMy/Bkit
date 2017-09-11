package ex03;

public class Ex01 {

	public static void main(String[] args) {

		String s = "i love me";
		String s1 = "i love me";
		String s2 = "i hate me";

		System.out.println(s == s1);// true
		System.out.println(s == s2);// false

		System.out.println("-------------");
		String os = new String("i love me");
		String os1 = new String("i love me");
		String os2 = new String("i hate me");

		System.out.println(os == os1);// false vì ở 2 ô nhớ khác nhau
		System.out.println(os == os2);// false
		System.out.println("-------------");

		System.out.println(s == os);// false
		System.out.println("-------------");

		System.out.println(s.equals(s1));// true
		System.out.println(s.equals(s2));// false
		System.out.println("-------------");

		System.out.println(os.equals(os1));// true
		System.out.println(os.equals(os2));// false
		System.out.println("-------------");

		System.out.println(s.equals(os));// true

	}

}
