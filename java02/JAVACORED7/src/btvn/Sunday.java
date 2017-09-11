package btvn;

import java.util.Calendar;

public class Sunday {

	public static void main(String[] args) {
		Sunday sun = new Sunday();
		Calendar cal = Calendar.getInstance();
		for (int i = 1; i <= 12; i++) {
			System.out.println(sun.maxDay(i, 2016));
		}

	}

	public int maxDay(int month, int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.DAY_OF_MONTH, month - 1);
		cal.set(Calendar.YEAR, year);
		int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		return maxDay;
	}

}
