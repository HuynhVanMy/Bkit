package javacored8;

import java.util.Calendar;

public class InNgayChuNhatCuaThang {

	public static void main(String[] args) {
		InNgayChuNhatCuaThang item = new InNgayChuNhatCuaThang();
		Calendar cal = Calendar.getInstance();
		item.outputSunday(cal);

	}

	public void outputSunday(Calendar cal) {
		int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		for (int i = 1; i <= maxDay; i++) {
			cal.set(Calendar.DAY_OF_MONTH, i);
			if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				System.out.println(i);
			}
		}
	}

}
