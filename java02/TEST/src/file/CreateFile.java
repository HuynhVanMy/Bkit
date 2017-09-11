package file;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		File file = new File("demo.txt");
		try {
			file.createNewFile();
			System.out.println("---------");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(file.getPath());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		
	}
	
}
