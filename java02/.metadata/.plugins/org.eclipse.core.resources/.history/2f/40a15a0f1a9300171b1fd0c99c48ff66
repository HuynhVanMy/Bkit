package bai04;

import java.util.TreeMap;

public class DictionaryView {

	public static void main(String[] args) {
		DictionaryController controller = new DictionaryController();
		TreeMap<String, Dictionary> dictionary = new TreeMap<>();
		boolean check = true;
		do {
			switch (controller.menu()) {
			case 1:
				dictionary = controller.addDictionary();
				break;
			case 2:
				controller.findDiction(dictionary);
				break;
			case 3:
				controller.output(dictionary);
				break;
			case 4:
				check = false;
				break;

			default:
				System.out.println("không có chức năng này !!!");
				check = true;
				break;
			}
		} while (check);
		System.out.println("---bye---");
	}

}
