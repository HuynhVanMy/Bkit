package bai02;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Money {

	public static void main(String[] args) {

		Money item = new Money();
		float moneyVN = item.inputData("số tiền cần chuyển đổi");
		float moneyLA = moneyVN / 2.75f;
		float moneyEU = moneyVN / 25000;

		item.ouput(moneyVN, moneyLA, moneyEU);

	}

	public void ouput(float moneyVN, float moneyLA, float moneyEU) {
		NumberFormat vnCur = NumberFormat.getCurrencyInstance(new Locale("vn", "VN"));
		NumberFormat laCur = NumberFormat.getCurrencyInstance(new Locale("lo", "LA"));
		NumberFormat euCur = NumberFormat.getCurrencyInstance(new Locale("EUR", "AU"));

		System.out.println(vnCur.format(moneyVN) + "\n = " + laCur.format(moneyLA) + "\n = " + euCur.format(moneyEU));
	}

	public float inputData(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		float m = 0;
		boolean check = true;
		do {
			try {
				System.out.print("Nhập " + s + ": ");
				m = Float.parseFloat(sc.nextLine());
				check = false;
				checkMoney(m);
			} catch (NumberFormatException e) {
				System.out.println("ko đc nhập bậy !!!");
				check = true;
			}
		} while (check);
		return m;
	}

	public void checkMoney(float m) throws NumberFormatException {
		if (m < 1000) {
			throw new NumberFormatException();
		}
	}

}
