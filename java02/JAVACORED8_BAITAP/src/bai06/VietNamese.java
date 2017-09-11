package bai06;

public class VietNamese {

	public static void main(String[] args) {

		String s1 = "Em có yêu anh không để anh biết còn chờ";
		String s = "";
		String s2 = "áàảãạăắằẳẵặâấầẩẫậđéèẻẽẹêếềểễệíìỉĩịóòỏõọôốồổỗộơớờởợúùủũụưứừửữựýỳỷỹỵĂẮẰẲẴẶÂẤẦẨẪẬĐÊẾỀỂỄỆÔỐỒỔỖỘƠỚỜỞỢƯỨỪỬỮỰÁÀẢÃẠÉÈẺẼẸÍÌỈĨỊÓÒỎÕỌÚÙỦŨỤÝỲỶỸỴ";
		String s3 = "aaaaaaaaaaaaaaaaadeeeeeeeeeeeiiiiioooooooooooooooouuuuuuoooooyyyyyAAAAAAAAAAAADEEEEEEOOOOOOOOOOOUUUUUUAAAAAEEEEEIIIIIOOOOOUUUUUYYYYY";
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					s += s3.charAt(j);
					break;
				} else if (j == s2.length() - 1) {
					s += s1.charAt(i);
				}
			}
		}
		System.out.println(s);
	}
}
