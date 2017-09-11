package bai02Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import bai02bean.Bill;
import bai02bean.Time;

public class BillController {

	public int menu() {
		System.out.println("-----MENU-----" + "\n1. Nhập danh sách hóa đơn" + "\n2. Xuất danh sách hóa đơn"
				+ "\n3. Tính tổng số lượng cho từng loại thuê phòng.Theo giờ || Theo ngày" + "\n4. Thêm 1 hóa đơn"
				+ "\n5. Xóa 1 hóa đơn" + "\n6. Tính trung bình thành tiền của hóa đơn thuê phòng trong tháng"
				+ "\n7. Thoát");
		int n = TimeController.checkNumber("Nhập chức năng tương ứng");
		return n;
	}

	public float trungBinhTien(List<Bill> listBill) {
		float tienTB = 0;
		int count = 0;
		int thang = TimeController.checkNumber("Nhập tháng cần tính trung bình tiền");
		for (int i = 0; i < listBill.size(); i++) {
			if (listBill.get(i).getNgayDen().getThang() == thang) {
				count++;
				tienTB += listBill.get(i).getThanhTien();
			}
		}

		return tienTB / count;
	}

	public List<Bill> deleteBill(List<Bill> listBill) {
		String str = inputStr("mã hóa đơn cần xóa");
		for (int i = 0; i < listBill.size(); i++) {
			if (str.equals(listBill.get(i).getMaHD())) {
				listBill.remove(listBill.get(i));
			} else if (i == listBill.size()) {
				System.out.println("không có hóa đơn cần xóa!!!");
			}
		}
		return listBill;
	}

	public List<Bill> addBill(List<Bill> listBill) {
		System.out.println("Nhập hóa đơn cần thêm:");
		listBill.add(inputData());
		return listBill;
	}

	public void soLuongHD(int[] arr) {
		System.out.println("Số lượng hóa đơn theo giờ: " + arr[0]);
		System.out.println("Số lượng hóa đơn theo ngày: " + arr[1]);
	}

	public int[] tinhSoLuong(List<Bill> listBill) {
		int[] arr = new int[2];
		for (Bill bill : listBill) {
			if (bill.getMaHD().contains("HOUR")) {
				arr[0]++;
			} else {
				arr[1]++;
			}
		}
		return arr;
	}

	public float tinhTien(Time ngayDen, Time ngayDi, String maHD, float donGia) {
		float thanhTien = 0;
		if (maHD.contains("HOUR")) {
			thanhTien = donGia * gioO(ngayDen, ngayDi);
		} else {
			if (ngayO(ngayDen, ngayDi) > 7) {
				thanhTien = donGia * 7
						+ (donGia * (ngayO(ngayDen, ngayDi) - 7) - donGia * (ngayO(ngayDen, ngayDi) - 7) * 0.07f);
			} else {
				thanhTien = donGia * ngayO(ngayDen, ngayDi);
			}
		}
		return thanhTien;
	}

	public int ngayO(Time ngayDen, Time ngayDi) {
		int ngayO = 0;
		int ngay = ngayDi.getNgay() - ngayDen.getNgay();
		int thang = ngayDi.getThang() - ngayDen.getThang();
		if (thang >= 1) {
			ngayO = ngay + thang * 30;// tạm thời tháng có 30 ngày
		} else if (ngay >= 1) {
			ngayO = ngay;
		}
		return ngayO;
	}

	public int gioO(Time ngayDen, Time ngayDi) {
		int gioO = ngayDi.getGio() - ngayDen.getGio();
		int ngay = ngayDi.getNgay() - ngayDen.getNgay();
		if (ngay == 1) {
			gioO += 24;
		}
		return gioO;
	}

	public void output(List<Bill> listBill) {
		for (Bill bill : listBill) {
			System.out.println(bill.toString());
			System.out.println();
		}
	}

	public List<Bill> listBill() {
		int n = TimeController.checkNumber("Nhập số lượng hóa đơn");
		List<Bill> listBill = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			listBill.add(inputData());
		}
		System.out.println();
		return listBill;
	}

	public Bill inputData() {

		String tenKH = inputStr("tên khách hàng");
		String maPhong = inputStr("mã phòng");
		Time ngayDen = TimeController.inputDateTime("ngày đến");
		Time ngayDi = TimeController.inputDateTime("ngày đi");
		String maHD = "";
		float donGia = 0;
		if (!checkNgayO(ngayDen, ngayDi)) {
			maHD = "DATE-" + (new Random().nextInt(899) + 100);
			donGia = 200000;
		} else {
			maHD = "HOUR-" + (new Random().nextInt(899) + 100);
			donGia = 50000;
		}
		float thanhTien = tinhTien(ngayDen, ngayDi, maHD, donGia);
		Bill item = new Bill(maHD, tenKH, maPhong, ngayDen, ngayDi, donGia, thanhTien);
		System.out.println();
		return item;
	}

	public boolean checkNgayO(Time ngayDen, Time ngayDi) {
		int ngay = ngayDi.getNgay() - ngayDen.getNgay();
		int thang = ngayDi.getThang() - ngayDen.getThang();
		// int nam = ngayDi.getNam() - ngayDen.getNam();
		int gio = ngayDi.getGio() - ngayDen.getGio();
		if (thang >= 1) {
			return false;
		} else if (ngay > 1) {
			return false;
		} else if (ngay == 1) {
			gio += 24;
		}
		if (ngay <= 1) {
			if (gio >= 24) {
				return false;
			} else {
				return true;
			}
		}
		return false;
	}

	public String inputStr(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str = "";
		System.out.print("Nhập " + s + ": ");
		str = sc.nextLine();
		return str;

	}

}
