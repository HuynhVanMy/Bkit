package bai02view;

import bai02bean.GiamDocBean;
import bai02bean.NhanVienBean;
import bai02bean.TruongPhongBean;
import bai02controller.GiamDocController;
import bai02controller.NhanVienController;
import bai02controller.PeopleController;
import bai02controller.TruongPhongController;

public class Main {
	public static void main(String[] args) {
		PeopleController ctrlPP = new PeopleController();
		GiamDocController ctrlGD = new GiamDocController();
		TruongPhongController ctrlTP = new TruongPhongController();
		NhanVienController ctrlNV = new NhanVienController();

		boolean check = true;
		do {
			int n = ctrlPP.menu();
			switch (n) {
			case 1:
				GiamDocBean itemGD = ctrlGD.inputData();
				ctrlGD.output(itemGD);
				break;
			case 2:
				TruongPhongBean itemTP = ctrlTP.inputData();
				ctrlTP.output(itemTP);
				break;
			case 3:
				NhanVienBean itemNV1 = ctrlNV.inputData("1");
				NhanVienBean itemNV2 = ctrlNV.inputData("2");
				ctrlNV.output(itemNV1, "1");
				ctrlNV.output(itemNV2, "2");
				break;
			case 4:
				check = false;
			}
		} while (check);

		System.out.println("==THE END==");
	}
}
