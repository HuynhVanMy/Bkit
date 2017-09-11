package bai02view;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import bai02Controller.BillController;
import bai02bean.Bill;

public class Billview {

	public static void main(String[] args) {
		BillController billCtr = new BillController();
		List<Bill> listBill = new ArrayList<>();
		boolean check = true;
		do {

			switch (billCtr.menu()) {
			case 1:
				listBill = billCtr.listBill();
				break;
			case 2:
				billCtr.output(listBill);
				break;
			case 3:
				int[] soLuonHD = billCtr.tinhSoLuong(listBill);
				billCtr.soLuongHD(soLuonHD);
				break;
			case 4:
				listBill = billCtr.addBill(listBill);
				break;
			case 5:
				listBill = billCtr.deleteBill(listBill);
				break;
			case 6:
				System.out.println("Tiền trung bình trong tháng là: "
						+ new DecimalFormat("#,###.00").format(billCtr.trungBinhTien(listBill) + " VNĐ"));
				break;
			case 7:
				System.out.println("THANK YOU");
				check = false;
				break;

			default:
				System.out.println("vui lòng chọn đúng chức năng!!!");
			}
		} while (check);
	}

}
