package playercontroller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import playerbean.Player;

public class PlayerController {

	public List<Player> inputData(int n) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		List<Player> alItem = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			System.out.println("Input number: ");
			String number = sc.nextLine();
			System.out.println("Input fullname: ");
			String fullname = sc.nextLine();
			System.out.println("Input salary: ");
			double salary = Double.parseDouble(sc.nextLine());
			Player item = new Player(number, fullname, salary);
			alItem.add(item);

		}
		return alItem;
	}

	public void output(List<Player> alItem) {
		for (Player item : alItem) {
			System.out.println(item.toString());
		}
	}

	public List<Player> sortBysalary(List<Player> alItem) {
		// 2 cách
		Collections.sort(alItem, new Comparator<Player>() {
			@Override
			public int compare(Player itemOne, Player itemTwo) {
				return (int) (itemOne.getSalary() - itemTwo.getSalary());
			}
		});
		return alItem;
	}

	public List<Player> sortByName(List<Player> alItem) {
		Collections.sort(alItem, new Comparator<Player>() {
			@Override
			public int compare(Player itemOne, Player itemTwo) {
				if (itemOne.getFullname().compareToIgnoreCase(itemTwo.getFullname()) > 0) {
					return 1;
				} else if (itemOne.getFullname().compareToIgnoreCase(itemTwo.getFullname()) == 0) {
					return 0;
				} else {
					return -1;
				}
			}
		});
		return alItem;
	}

	public int add(List<Player> alItem, Player itemAdd) {
		int result = 0;
		result = alItem.add(itemAdd) == true ? 1 : 0;
		return result;
	}

	/*
	 * public List<Player> add(List<Player> alItem, Player itemAdd) {
	 * alItem.add(itemAdd); return alItem; }
	 */

}
