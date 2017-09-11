package bai01;

import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		Sach itemS = new Sach();
		DecimalFormat formater = new DecimalFormat("#,###,###.0");
		boolean check = true;
		do {
			int n = itemS.menu();
			switch (n) {
			case 1:
				SachGK[] itemSGK = new SachGK[5];
				for (int i = 0; i < itemSGK.length; i++) {
					itemSGK[i] = new SachGK();
					itemSGK[i].inputData();
				}
				for (int i = 0; i < itemSGK.length; i++) {
					itemSGK[i].output();
				}
				SachGK item = new SachGK();
				System.out.println("\n***Tổng tiền: " + formater.format(item.tongTien(itemSGK)));
				item.thongTinNXB(itemSGK);
				break;
			case 2:
				SachTK[] itemTK = new SachTK[5];
				for (int i = 0; i < itemTK.length; i++) {
					itemTK[i] = new SachTK();
					itemTK[i].inputData();
				}
				for (int i = 0; i < itemTK.length; i++) {
					itemTK[i].output();
				}
				SachTK item1 = new SachTK();
				System.out.println("\n***Tổng tiền: " + formater.format(item1.tongTien(itemTK)));
				item1.trungBinh(itemTK);
				break;
			case 3:
				check = false;
			}
		} while (check);
	}

}
