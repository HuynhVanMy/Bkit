package bai02;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DemThoiGian {

	public static void main(String[] args) {
		Calendar cal1 = new GregorianCalendar();
		Calendar cal2 = new GregorianCalendar(2017, 0, 1);
		System.out.println(cal1.getTime());
		System.out.println(cal2.getTime());
		long day = (cal1.getTime().getTime() - cal2.getTime().getTime()) / (24 * 3600 * 1000) + 1;
		System.out.println(day);
		System.out.println(cal1.get(Calendar.DAY_OF_YEAR));
	}

}
