package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList01 {

	public static void main(String[] args) {
		ArrayList<Integer> listSN = new ArrayList<Integer>();
		System.out.println(listSN.hashCode());
		listSN.add(1); // i = 0
		System.out.println(listSN.hashCode());
		listSN.add(3); // i =1
		System.out.println(listSN.hashCode());
		listSN.add(5); // i =2
		listSN.add(3); // i = 3
		listSN.add(12);
		System.out.println("-------------");
		ArrayList<Integer> lisst = new ArrayList<Integer>();
		System.out.println(lisst.hashCode());
		lisst.add(1); // i = 0
		System.out.println(lisst.hashCode());
		lisst.add(3); // i =1
		System.out.println(lisst.hashCode());
		lisst.add(5); // i =2
		lisst.add(3); // i = 3
		lisst.add(12);

		System.out.println("phần tử cuối cùng: " + listSN.get(listSN.size() - 1));

		/** cách 1 **/

		// lấy tất cả phần tử trong listSN
		Iterator<Integer> interSN = listSN.iterator(); // element
		// kiểm tra còn phần tử nào không
		while (interSN.hasNext()) { // hasMoreElement

			System.out.println(interSN.next()); // nextElement

		}

		/** cách 2 **/
		for (int i = 0; i < listSN.size(); i++) {
			// lấy ra từng phần tử trong listSN
			System.out.println(listSN.get(i)); // a[i]
		}

		/** cách 3 **/
		for (Integer item : listSN) {
			System.out.println(item);
		}

		/**
		 * size() : collection length() : String length : Array
		 **/
	}

}
