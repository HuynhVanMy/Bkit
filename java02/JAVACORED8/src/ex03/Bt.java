package ex03;

public class Bt {

	public static void main(String[] args) {

		String[] bh = new String[] { "d:/music/vetnangcuoitroi.mp3", "d:/music/canhathuongnhau.mp3" };

		for (int i = 0; i < bh.length; i++) {
			System.out.println(bh[i].substring(bh[i].lastIndexOf("/") + 1, bh[i].indexOf(".")));
		}

		String s = "Happy New Year New year";
		String s1 = "New";
		String s2 = "Last";

		System.out.println("A".hashCode());
		System.out.println("b".hashCode());

		System.out.println("--------------");
		//
		System.out.println(s2.hashCode());
		System.out.println("--------------");
		// so Sánh chuỗi => trả về < 0, 0, > 0
		System.out.println(s.compareTo(s1));

		System.out.println("--------------");

		// tìm vị trí xuất hiện đầu tiên của chuỗi s1 trong s
		System.out.println(s.indexOf(s1));
		System.out.println("--------------");
		// tìm vị trí xuất hiện cuối cùng của chuỗi s1 trong s
		System.out.println(s.lastIndexOf(s1));
		System.out.println("--------------");
		// thay thế chuỗi s1 = chuỗi s2 trong chuỗi s
		System.out.println(s.replace(s1, s2));
		System.out.println("--------------");
		String s3 = "	i	 love     java";
		s3 = s3.trim();
		System.out.println(s3);
		s3 = s3.replaceAll("\\s+", " ");
		System.out.println(s3);
		System.out.println("--------------");
		// tạo chuỗi con
		String s4 = s.substring(6);
		System.out.println(s4);
		//
		String s5 = s.substring(s.indexOf("N"), s.lastIndexOf("N"));
		System.out.println(s5);
		System.out.println("--------------");
		// cắt chuỗi

		String[] s6 = s.split(" ");
		for (String ss : s6) {
			System.out.println(ss);
		}
		System.out.println("\n-");
		String[] s7 = s.split(" ", 3);
		for (String sss : s7) {
			System.out.println(sss);
		}

		System.out.println("-------------");

		StringBuilder sb = new StringBuilder("xin chao cac ban");
		System.out.println(sb);
		sb.append(" nhé");
		System.out.println(sb);

	}

}
