package bai01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class ArrayListInt {

	public static void main(String[] args) {
		ArrayListInt item = new ArrayListInt();

		ArrayList<Integer> listInt = item.createArrList();
		item.printArrList(listInt);
		System.out.println("\nTổng các số chẳn: " + item.addTotal(listInt));
		item.sort(listInt);
		item.printArrList(listInt);
		System.out.println("\nPhần tử lớn thứ 2 trong mảng là : " + item.maxElementSecond(listInt));
		System.out.println("Tổng Phần tử đầu tiên và cuối cùng là : " + item.totalFistLastArr(listInt));

	}

	public int totalFistLastArr(ArrayList<Integer> listInt) {
		return listInt.get(0) + listInt.get(listInt.size() - 1);
	}

	public int maxElementSecond(ArrayList<Integer> listInt) {
		return listInt.get(listInt.size() - 2);
	}

	public void sort(ArrayList<Integer> listInt) {
		Collections.sort(listInt);
	}

	public void printArrList(ArrayList<Integer> listInt) {
		for (Integer item : listInt) {
			System.out.print(item + " ");
		}
	}

	public int addTotal(ArrayList<Integer> listInt) {
		int total = 0;
		for (Integer item : listInt) {
			if (item % 2 == 0) {
				total += item;
			}
		}
		return total;
	}

	public ArrayList<Integer> createArrList() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean flag = true;
		do {
			try {
				System.out.print("Nhập số phần tử: ");
				n = Integer.parseInt(sc.nextLine());
				flag = false;
			} catch (NumberFormatException e) {
				System.out.println("nonsense !!!");
				flag = true;
			}
		} while (flag);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(new Random().nextInt(99));
		}

		return list;
	}

}
