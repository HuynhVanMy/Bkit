package bai03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class SetOfNumber {

	public static void main(String[] args) {

		SetOfNumber item = new SetOfNumber();
		HashSet<Integer> setInt01 = item.createSetInt();
		HashSet<Integer> setInt02 = item.createSetInt();
		
		System.out.println("setInt01");
		item.printSetOfNumber(setInt01);

		System.out.println("setInt02");
		item.printSetOfNumber(setInt02);

		System.out.println("union");
		HashSet<Integer> union = item.union(setInt01, setInt02);
		ArrayList<Integer> listUnion = item.sortList(union);
		item.printList(listUnion);

		System.out.println("giao");
		HashSet<Integer> giao = item.giao(setInt01, setInt02);
		ArrayList<Integer> listGiao = item.sortList(giao);
		item.printList(listGiao);

		System.out.println("diff");
		HashSet<Integer> diff = item.diff(setInt01, setInt02);
		ArrayList<Integer> listDiff = item.sortList(diff);
		item.printList(listDiff);
	}

	public void printList(ArrayList<Integer> listInt) {
		for (Integer item : listInt) {
			System.out.print(item + " ");
		}
		System.out.println("\n--------");
	}

	// sắp xếp
	public ArrayList<Integer> sortList(HashSet<Integer> setInt) {
		ArrayList<Integer> listInt = new ArrayList<>(setInt);
		Collections.sort(listInt);
		return listInt;
	}

	// tìm hiệu
	public HashSet<Integer> diff(HashSet<Integer> setInt01, HashSet<Integer> setInt02) {
		HashSet<Integer> setInt03 = new HashSet<Integer>(setInt01);
		setInt03.removeAll(setInt02);
		return setInt03;
	}

	// tìm giao
	public HashSet<Integer> giao(HashSet<Integer> setInt01, HashSet<Integer> setInt02) {
		HashSet<Integer> setInt03 = new HashSet<Integer>(setInt01);
		setInt03.retainAll(setInt02);
		return setInt03;
	}

	// tìm hội
	public HashSet<Integer> union(HashSet<Integer> setInt01, HashSet<Integer> setInt02) {
		HashSet<Integer> setInt03 = new HashSet<Integer>(setInt01);
		setInt03.addAll(setInt02);
		return setInt03;
	}

	// in ra tập hợp
	public void printSetOfNumber(HashSet<Integer> setInt) {
		for (Integer item : setInt) {
			System.out.print(item + " ");
		}
		System.out.println("\n--------");
	}

	// tạo tập hợp ngẫu nhiên
	public HashSet<Integer> createSetInt() {
		HashSet<Integer> setInt = new HashSet<Integer>();
		int size = new Random().nextInt(6) + 1;
		for (int i = 0; i < size; i++) {
			boolean flag = true;
			do {
				int temp = new Random().nextInt(30);
				if (checkElementSet(temp, setInt, i)) {
					setInt.add(temp);
					flag = false;
				}
			} while (flag);
		}
		return setInt;
	}

	// kiểm tra phần tử trùng lặp để add vào HashSet
	public boolean checkElementSet(int element, HashSet<Integer> setInt, int index) {
		for (Integer item : setInt) {
			if (element == item) {
				return false;
			}
		}
		return true;
	}

}
