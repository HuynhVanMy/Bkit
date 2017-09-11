package bai01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatLib {

	public static void main(String[] args) {
		float value = 123456798.123321f;

		DecimalFormat decimalFormat = new DecimalFormat("#,###.###");
		System.out.println(decimalFormat.format(value));

		System.out.println("----------------");
		System.out.println(Locale.getDefault());
		NumberFormat numberFormat = NumberFormat.getInstance();
		System.out.println(numberFormat.format(value));
	}

}
