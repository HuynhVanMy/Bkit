package collection;

import java.util.ArrayList;

public class LearnArrayList {

	public static void main(String[] args) {
		ArrayList listOne = new ArrayList();
		listOne.add(1);
		listOne.add(1.7);
		listOne.add("Hi Chien");
		outputData(listOne);

		ArrayList<Double> listTwo = new ArrayList<>();

	}

	private static void outputData(ArrayList listOne) {
		for (Object item : listOne) {
			System.out.println(item);
		}

	}

	// Generrics: jdk 1.5 version 5

}
