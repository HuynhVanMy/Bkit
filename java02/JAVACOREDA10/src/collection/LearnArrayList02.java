package collection;

import java.util.ArrayList;

public class LearnArrayList02 {

	public static void main(String[] args) {
		ArrayList<String> listStr = new ArrayList<String>();
		for (char i = 65; i <= 90; i++) {
			listStr.add(String.valueOf(i));
		}

		outputData(listStr);
	}

	private static void outputData(ArrayList<String> listStr) {

	}

}
