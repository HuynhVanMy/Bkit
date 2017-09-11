package javacored8;

public class InKyTuTheoYeuCauBai02 {

	public static void main(String[] args) {
		InKyTuTheoYeuCauBai02 item = new InKyTuTheoYeuCauBai02();
		String s = "	Huynh 	Van My";
		s = item.controllStr(s);
		System.out.println("---In ra mỗi kí tự trên một dòng---");
		item.outputEveryChar(s);
		System.out.println("---In ra mỗi từ trên mỗi dòng, các từ các nhau bởi kí tự trống---");
		item.outputEveryWord(s);
		System.out.println("---In ra chuỗi đảo ngược mỗi kí tự trên một dòng---");
		item.outputResEveryChar(s);
		System.out.println("---In ra đảo ngược mỗi từ trên một dòng---");
		item.outputResWord(s);
	}

	public String controllStr(String s) {
		s = s.trim();
		s = s.replaceAll("\\s+", " ");
		return s;
	}

	public void outputEveryChar(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}

	public void outputEveryWord(String s) {
		String[] arr = s.split(" ");
		for (String item : arr) {
			System.out.println(item);
		}
	}

	public void outputResEveryChar(String s) {
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}
	}

	public void outputResWord(String s) {
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ') {
				System.out.println();
			} else {
				System.out.print(s.charAt(i));
			}
		}
	}

}
