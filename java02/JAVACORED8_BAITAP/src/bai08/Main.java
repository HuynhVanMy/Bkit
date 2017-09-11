package bai08;

public class Main {
	public static void main(String[] args) {

		Controller ctrl = new Controller();
		int n = ctrl.soLuongKH("số lượng khách hàng");
		Hotel[] item = new Hotel[n];
		for (int i = 0; i < item.length; i++) {
			item[i] = ctrl.inputData();
		}

		for (int i = 0; i < item.length; i++) {
			System.out.println("--------");
			ctrl.output(item[i]);
		}

		System.out.println("Loại phòng" + "\t" + "Tổng tiền");
		for (int i = 0; i < item.length; i++) {
			ctrl.inThongKe(item[i]);
		}

	}

}
