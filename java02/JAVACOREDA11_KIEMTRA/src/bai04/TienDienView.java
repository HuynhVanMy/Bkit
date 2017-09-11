package bai04;

import java.text.DecimalFormat;
import java.util.List;

public class TienDienView {

	public static void main(String[] args) {
		TienDienController controller = new TienDienController();
		List<TienDien> listTienDien = controller.listTienDien();
		controller.output(listTienDien);
		System.out.println();
		System.out.println("------------");
		System.out.println();
		DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
		System.out.println("Tổng chi phí trong 1 tháng: " + decimalFormat.format(controller.tongChiPhi(listTienDien)));
		System.out.println();
		System.out.println("------------");
		System.out.println();
		listTienDien = controller.sortByName(listTienDien);
		controller.output(listTienDien);
		System.out.println();
		System.out.println("------------");
		System.out.println();
		listTienDien = controller.add(listTienDien);
		controller.output(listTienDien);
		System.out.println();
		System.out.println("------------");
		System.out.println();
		listTienDien = controller.addSymbol(listTienDien);
		controller.output(listTienDien);
		System.out.println();
		System.out.println("------------");
		System.out.println();
		listTienDien = controller.sortBySoDien(listTienDien);
		controller.output(listTienDien);

	}

}
