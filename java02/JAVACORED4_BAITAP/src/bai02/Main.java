package bai02;

import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		Main item = new Main();
		item.view();
		System.out.println("===SEE YOU AGAIN===");
	}
	
	public void view(){
		DecimalFormat df = new DecimalFormat("#,###,###,###.00");
		boolean check = true;
		do {
			System.out.println("****LỰA CHỌN CỦA BẠN****"
							 + "\n1. Giám đốc." 
							 + "\n2. Trưởng phòng." 
							 + "\n3. Nhân viên."
							 + "\n4. Thoát.");
			People item = new People();
			int n = (int) item.checkInput("ở đây");
			switch (n) {
			case 1:
				GiamDoc gdItem = new GiamDoc();
				gdItem.inputData("giám đốc");
				gdItem.ouput();
				System.out.println("Lương giám đốc: " + df.format(gdItem.tinhLuong()) + " USD");
				break;
				
			case 2:
				TruongPhong tpItem = new TruongPhong();
				tpItem.inputData("trưởng phòng");
				tpItem.ouput();
				System.out.println("Lương trưởng phòng: " + df.format(tpItem.tinhLuong()) + " USD");
				break;

			case 3:
				NhanVien nvItem_1 = new NhanVien();
				NhanVien nvItem_2 = new NhanVien();
				nvItem_1.inputData("Nhân viên 1");
				nvItem_2.inputData("Nhân viên 2");
				System.out.println("\n= NHÂN VIÊN =");
				nvItem_1.ouput("1");
				System.out.println("Lương nhân viên 1: " + df.format(nvItem_1.tinhLuong()) + " USD");
				nvItem_2.ouput("2");
				System.out.println("Lương nhân viên 2: " + df.format(nvItem_2.tinhLuong()) + " USD");
				break;

			case 4:
				check = false;
			}
		} while (check);

	}
	
}
