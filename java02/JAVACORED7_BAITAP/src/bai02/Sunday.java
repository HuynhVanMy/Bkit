package bai02;

import java.util.Calendar;

public class Sunday {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("Today:" + cal.getTime());
		output();
	}

	public static void output() {
		Calendar cal = Calendar.getInstance();
		for (int i = 1; i <= 12; i++) {
			cal.set(2017, i - 1, 1);
			int max = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			System.out.println("Tháng " + i);
			for (int j = 1; j <= max; j++) {
				cal.set(Calendar.DAY_OF_MONTH, j);
				if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
					System.out.println(j);
				}
			}
		}
	}

}
