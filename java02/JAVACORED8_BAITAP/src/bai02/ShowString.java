package bai02;

public class ShowString {

	public static void main(String[] args) {
		ShowString item = new ShowString();
		String s = "huynh     van			 my";
		s = item.controlStr(s);

		item.outputChar(s);
		item.outputStr(s);
		item.outputCharRev(s);
		item.outputStrRev(s);

	}

	public String controlStr(String s) {
		s = s.trim();
		s = s.replaceAll("\\s+", " ");
		return s;
	}

	// in ra mỗi kí tự trên 1 dòng
	public void outputChar(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}

	// in ra mỗi kí tự trên 1 dòng theo chiều ngược lại
	public void outputCharRev(String s) {
		System.out.println("\n-----------");
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}
	}

	// in ra mỗi từ trên 1 dòng
	public void outputStr(String s) {
		System.out.println("\n---------");
		for (int i = 0; i < s.length(); i++) {
			if (String.valueOf(s.charAt(i)).equals(" ")) {
				System.out.println();
			} else {
				System.out.print(s.charAt(i));
			}
		}
	}

	// in ra mỗi từ trên 1 dòng
	public void outputStrRev(String s) {
		System.out.println("\n---------");
		for (int i = s.length() - 1; i >= 0; i--) {
			if (String.valueOf(s.charAt(i)).equals(" ")) {
				System.out.println();
			} else {
				System.out.print(s.charAt(i));
			}
		}
	}
}
