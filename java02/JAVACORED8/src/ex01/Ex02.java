package ex01;

public class Ex02 {

	public static void main(String[] args) {

		// tính chiều dài chuỗi s
		String str = "today";
		int doDai = str.length();
		System.out.println(doDai);
		// nối chuỗi
		String str1 = "bkit";
		str.concat(str1); // phân biệt với cái dưới. câu hỏi pv
		str += str1;
		System.out.println(str);

	}

}
