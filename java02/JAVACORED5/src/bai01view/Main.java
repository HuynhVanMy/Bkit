package bai01view;

import java.text.DecimalFormat;

import bai01bean.SachGK;
import bai01bean.SachTK;
import bai01controller.SachController;
import bai01controller.SachGKController;
import bai01controller.SachTKController;

public class Main {

	public static void main(String[] args) {
		SachController controllerS = new SachController();
		SachGKController controllerGK = new SachGKController();
		SachTKController contronllerTK = new SachTKController();
		DecimalFormat formater = new DecimalFormat("#,###,###.0");

		boolean check = true;
		do {
			int n = controllerS.menu();
			switch (n) {
			case 1:
				SachGK[] itemGK = new SachGK[5];
				for (int i = 0; i < itemGK.length; i++) {
					itemGK[i] = new SachGK();
					itemGK[i] = controllerGK.intputData();
				}
				for (int i = 0; i < itemGK.length; i++) {
					controllerGK.output(itemGK[i]);
				}
				System.out.println("\n***Tổng tiền: " + formater.format(controllerGK.totalMoney(itemGK)));
				controllerGK.thongTinNXB(itemGK);
				break;
			case 2:
				SachTK[] itemTK = new SachTK[5];
				for (int i = 0; i < itemTK.length; i++) {
					itemTK[i] = new SachTK();
					itemTK[i] = contronllerTK.inputData();
				}
				for (int i = 0; i < itemTK.length; i++) {
					contronllerTK.output(itemTK[i]);
				}
				System.out.println("\n***Tổng tiền: " + formater.format(contronllerTK.totalMoney(itemTK)));
				contronllerTK.averaged(itemTK);
				break;
			case 3:
				check = false;
			}
		} while (check);

		System.out.println("----------------------------");
	}
}
