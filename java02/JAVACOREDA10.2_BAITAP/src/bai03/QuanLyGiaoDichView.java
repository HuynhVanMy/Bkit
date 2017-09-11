package bai03;

import java.text.DecimalFormat;
import java.util.List;

public class QuanLyGiaoDichView {

	public static void main(String[] args) {
		QuanLyGiaoDichControlller controlller = new QuanLyGiaoDichControlller();
		List<QuanLyGiaoDich> list = controlller.listGiaoDich();
		controlller.output(list);
		int[] arrSum = controlller.tongSoLuongGiaoDich(list);
		controlller.outputSoLuongGiaoDich(arrSum);
		DecimalFormat decimalFormat = new DecimalFormat("#,###");
		System.out.println("Trung bình thành tiền: " + decimalFormat.format(controlller.trungBinh(list)));
		List<QuanLyGiaoDich> listbigDonGia = controlller.bigDonGia(list);
		controlller.output(listbigDonGia);
	}

}
