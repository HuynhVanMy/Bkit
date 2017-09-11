package bai01;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 * Tính chiều dài của chuỗi s Nối chuỗi s1 vào chuỗi s Lấy một ký tự tại
		 * vị trí index trong chuỗi s Tìm vị trí xuất hiện đầu tiên của chuỗi s2
		 * trong chuỗi s So sánh hai chuỗi s1 và s2 : == so sánh cho tham chiếu
		 * (địa chỉ) equals so sánh cho nội dung giá trị true|| false compareTo
		 * str.compareTo(str2) => 1 0 -1 => Comparable
		 */

		String str = "today i @love@ me";
		int doDai = str.length();
		String str1 = "bkit";
		System.out.println(doDai);
		// str.concat(str1); -
		System.out.println(str.concat(str1));
		str += str1;

		System.out.println("-----------");

		// Lấy một ký tự tại vị trí index trong chuỗi s
		char kiTu2 = str.charAt(2);
		System.out.println(kiTu2);
		System.out.println("-----------------");

		// tìm vị trí xuất hiện
		int loveIndex = str.indexOf("love");
		System.out.println(loveIndex);

		int checkIndex = str.indexOf("@", str.indexOf("@") + 1);
		System.out.println(checkIndex);

	}

}
