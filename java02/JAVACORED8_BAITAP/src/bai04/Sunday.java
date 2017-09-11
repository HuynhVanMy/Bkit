package bai04;

import java.util.Calendar;

public class Sunday {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("Today: " + cal.getTime());
		System.out.println("Sunday of month:");
		output();

	}

	public static void output() {
		Calendar cal = Calendar.getInstance();
		int max = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		for (int i = 1; i <= max; i++) {
			cal.set(Calendar.DAY_OF_MONTH, i);
			if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				System.out.println(i);
			}
		}
	}
}
