package bai01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateCalLib {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy HH:mm:ss a");

		System.out.println(dateFormat.format(date));
		System.out.println("---------------------");

		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)); // ngày của tháng
		System.out.println(cal.get(Calendar.MONTH) + 1); // tháng hiện tại
		System.out.println(Calendar.OCTOBER + 1); // tháng bất kì
		System.out.println(cal.get(Calendar.DAY_OF_YEAR)); // ngày thứ .. của năm

		baitap();
	}

	public static void baitap() {
		GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();
		int month = cal.get(Calendar.MONTH) - 1;
		System.out.println(month);
		switch (month) {
		case Calendar.JANUARY:
		case Calendar.MARCH:
		case Calendar.MAY:
		case Calendar.JULY:
		case Calendar.AUGUST:
		case Calendar.OCTOBER:
		case Calendar.DECEMBER:
			System.out.println("có 31 ngày.");
			break;
		case Calendar.APRIL:
		case Calendar.JUNE:
		case Calendar.SEPTEMBER:
		case Calendar.NOVEMBER:
			System.out.println("có 30 ngày.");
			break;
		case Calendar.FEBRUARY:
			if (cal.isLeapYear(cal.get(Calendar.YEAR))) {
				System.out.println("có 29 ngày.");
			} else {
				System.out.println("có 28 ngày");
			}
			break;
		}
	}

}
