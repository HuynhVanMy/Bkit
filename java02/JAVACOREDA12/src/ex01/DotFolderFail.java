package ex01;

import java.io.File;
import java.io.IOException;

public class DotFolderFail {

	public static void main(String[] args) {
		File file = new File("D:\\thumuc\\1.A");

		if (!file.isDirectory()) {
			file.mkdir();
			System.out.println("--");
		}

		for (int i = 1; i <= 5; i++) {
			String fileName = i + ". " + String.valueOf((char) (96 + i));
			File fileOne = new File(file.getAbsolutePath() + File.separator + fileName + ".txt");

			if (!fileOne.exists()) {
				try {
					fileOne.createNewFile();
					System.out.println("Ok " + i);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
