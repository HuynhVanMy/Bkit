package ex01;

import java.io.File;
import java.io.IOException;

public class LFile {
	public static void main(String[] args) {
		// create a new file
		File file = new File("D:\\thumuc\\test.txt");
		System.out.println(file.getAbsolutePath());
		File root = new File(file.getAbsolutePath().substring(0, file.getAbsolutePath().lastIndexOf(File.separator)));
		if (!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("Sucess");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else{
			System.out.println("file is exist");
		}

	}

}
