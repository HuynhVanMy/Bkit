package redocollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class ArrsyList01 {

	public static void main(String[] args) {
		ArrayList<Integer> listInt = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			listInt.add(new Random().nextInt(99));
		}

		output01(listInt);
		output02(listInt);

		Iterator<Integer> iterInt = listInt.iterator();
		int i = 0;
		while (iterInt.hasNext()) {
			System.out.println(i++ + ": " + iterInt.next());
		}
		System.out.println("-----------");
		Collections.sort(listInt);
		output01(listInt);
		listInt.remove(0);
		listInt.remove(3);
		listInt.remove(7);
		output01(listInt);

	}

	private static void output02(ArrayList<Integer> listInt) {
		for (int i = 0; i < listInt.size(); i++) {
			System.out.println(i + ": " + listInt.get(i));
		}
		System.out.println("\n---------------");
	}

	private static void output01(ArrayList<Integer> listInt) {
		int i = 0;
		for (Integer item : listInt) {
			System.out.println(i++ + ": " + item);
		}
		System.out.println("\n---------------");
	}

}
