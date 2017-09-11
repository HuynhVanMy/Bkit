package bai03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Bai03Update {

	public static void main(String[] args) {

		Bai03Update item = new Bai03Update();
		Calendar cal = Calendar.getInstance();
		int date = item.inputData("ngày");
		int month = item.inputData("tháng") - 1; // vì tháng bắt đầu từ 0
		int year = item.inputData("năm");
		cal.set(year, month, date);
		item.output(cal);

	}

	public void output(Calendar cal) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(dateFormat.format(cal.getTime()) + " is " + getDayOfWeek(cal));
		System.out.println("Additional facts");
		System.out.println("It is day number " + cal.get(Calendar.DAY_OF_YEAR) + " of the year, "
				+ (getNumberDayOfYear(cal) - cal.get(Calendar.DAY_OF_YEAR)) + " days left.");
		System.out.println("It is " + getDayOfWeek(cal) + " number " + cal.get(Calendar.WEEK_OF_YEAR) + " out of "
				+ cal.getActualMaximum(Calendar.WEEK_OF_YEAR) + " in " + cal.get(Calendar.YEAR));
		System.out.println("It is" + getDayOfWeek(cal) + " number " + cal.get(Calendar.WEEK_OF_MONTH) + " of "
				+ cal.getActualMaximum(Calendar.WEEK_OF_MONTH) + " in " + getMonthOfYear(cal) + " "
				+ cal.get(Calendar.YEAR));
		System.out.println("Year " + cal.get(Calendar.YEAR) + " has " + getNumberDayOfYear(cal) + " days.");
		System.out.println(getMonthOfYear(cal) + " " + cal.get(Calendar.YEAR) + " has "
				+ cal.getActualMaximum(Calendar.DAY_OF_MONTH) + " days.");
	}

	public int inputData(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean check = true;
		do {
			try {
				System.out.print("Nhập " + s + ": ");
				n = Integer.parseInt(sc.nextLine());
				check = false;
			} catch (NumberFormatException e) {
				System.out.println("Ko đc nhập bậy !!!");
				check = true;
			}
		} while (check);
		return n;
	}

	public int getNumberDayOfYear(Calendar cal) {
		GregorianCalendar calendar = new GregorianCalendar();
		int year = 365;
		if (calendar.isLeapYear(cal.get(Calendar.YEAR))) {
			year = 366;
		}
		return year;
	}

	public String getMonthOfYear(Calendar cal) {
		int month = cal.get(Calendar.MONTH);
		String monthStr = "";
		switch (month) {
		case Calendar.JANUARY:
			monthStr += "JANUARY";
			break;
		case Calendar.FEBRUARY:
			monthStr += "FEBRUARY";
			break;
		case Calendar.MARCH:
			monthStr += "MARCH";
			break;
		case Calendar.APRIL:
			monthStr += "APRIL";
			break;
		case Calendar.MAY:
			monthStr += "MAY";
			break;
		case Calendar.JUNE:
			monthStr += "JUNE";
			break;
		case Calendar.JULY:
			monthStr += "JULY";
			break;
		case Calendar.AUGUST:
			monthStr += "AUGUST";
			break;
		case Calendar.SEPTEMBER:
			monthStr += "SEPTEMBER";
			break;
		case Calendar.OCTOBER:
			monthStr += "OCTOBER";
			break;
		case Calendar.NOVEMBER:
			monthStr += "NOVEMBER";
			break;
		case Calendar.DECEMBER:
			monthStr += "DECEMBER";
			break;
		}
		return monthStr;
	}

	public String getDayOfWeek(Calendar cal) {
		int day = cal.get(Calendar.DAY_OF_WEEK);
		String dayStr = "";
		switch (day) {
		case Calendar.MONDAY:
			dayStr += "MONDAY";
			break;
		case Calendar.TUESDAY:
			dayStr += "TUESDAY";
			break;
		case Calendar.WEDNESDAY:
			dayStr += "WEDNESDAY";
			break;
		case Calendar.THURSDAY:
			dayStr += "THURSDAY";
			break;
		case Calendar.FRIDAY:
			dayStr += "FRIDAY";
			break;
		case Calendar.SATURDAY:
			dayStr += "SATURDAY";
			break;
		case Calendar.SUNDAY:
			dayStr += "SUNDAY";
			break;

		}
		return dayStr;
	}

}
