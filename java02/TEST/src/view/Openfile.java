package view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Openfile {

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\picture\\qaz.docx");
		String s1 = "";
		FileReader fr = new FileReader(f); // tao doi tuong doc file
		BufferedReader br = new BufferedReader(fr); // tao doi tuong doc du lieu
													// tu doi tuong fr
		s1 = br.readLine();
		// String s1 = "Em có yêu anh không để anh biết còn chờ";
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
		File fa = new File("E:\\picture\\abd.txt");
		FileWriter fw = new FileWriter(fa);
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write(s); // truyen du lieu vao fw
		bw.close(); // dong truyen du lieu vao fw
		fw.close();
		fr.close();
		br.close();

	}
}
