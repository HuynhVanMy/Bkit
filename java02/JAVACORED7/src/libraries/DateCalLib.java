package libraries;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateCalLib {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);
		//System.out.println(date.getDate()); // k còn dùng nữa => Calendar...

		//date.setHours(15);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS a"); // hh
																					// 12h/
																					// HH
																					// 24h
		System.out.println(sdf.format(date));

		System.out.println("----------------");
		Calendar calNow = Calendar.getInstance();
		System.out.println(calNow.getTime());
		System.out.println(calNow.get(Calendar.DAY_OF_MONTH));
		System.out.println(calNow.get(Calendar.MONTH) + 1);
		System.out.println(Calendar.OCTOBER + 1);
		System.out.println(calNow.get(Calendar.DAY_OF_YEAR));
		// cái nào lấy của hiện tại thì dùng get
		
		baitap();
	}

	public static void baitap() {
		GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();
		int thang = cal.get(Calendar.MONTH) - 1;
		switch(thang){
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
			if(cal.isLeapYear(cal.get(Calendar.YEAR))){
				System.out.println("có 29 ngày.");
			}else{
				System.out.println("có 28 ngày");
			}
			break;
		}
	}

}
// in ra tất cả những ngày chủ nhật trong năm nay => về nhà
// in ra ngày chủ nhật cuối cùng trong năm đó
// tính thời gian yêu nhau của mối tình cuối cùng
// bài toán chuyển tiền
// vì sao yy hoặc yyyy y:year => gg
