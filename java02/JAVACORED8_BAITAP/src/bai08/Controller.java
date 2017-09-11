package bai08;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Controller {

	public Hotel inputData() {

		System.out.println("****");
		String maHoaDon = inputStr("mã hóa đơn");
		String tenKhachHang = "";
		boolean check = true;
		do {
			try {
				tenKhachHang = inputStr("tên khách hàng");
				check = false;
				if (!isName(tenKhachHang)) {
					throw new Exception();
				}
			} catch (Exception e) {
				check = true;
			}

		} while (check);
		check = true;
		String soChungMinh = "";
		do {
			try {
				soChungMinh = inputStr("số chứng minh");
				check = false;
				if (!isCard(soChungMinh)) {
					throw new Exception();
				}
			} catch (Exception e) {
				check = true;
			}

		} while (check);
		String gioiTinh = inputStr("giới tính(nam/nu)");
		String soPhong = inputStr("số phòng");
		String loaiPhong = loaiPhong(soPhong);
		String ngayDen = inputStr("ngày đến(dd/MM/yyyy)");
		String ngayDi = inputStr("ngày đi(dd/MM/yyyy)");
		String tienPhong = tienPhong(loaiPhong, ngayDen, ngayDi);

		Hotel item = new Hotel(maHoaDon, tenKhachHang, soChungMinh, gioiTinh, soPhong, loaiPhong, ngayDen, ngayDi,
				tienPhong);
		return item;

	}

	// kiểm tra tên
	public boolean isName(String s) {
		if (s.matches(".*[0-9].*") || s.matches(".*(?=.*[@#$%!^&*/,.`~?';=-]).*")) {
			return false;
		}
		return true;
	}

	// kiểm tra số chứng minh
	public boolean isCard(String s) {
		if (s.matches(".*[a-zA-Z].*") || s.matches(".*(?=.*[@#$%!^&*/,.`~?';=-]).*")) {
			return false;
		}
		return true;
	}

	// in ra thông tin
	public void output(Hotel item) {
		System.out.println(item.toString());
	}

	// nhập số lượng khách hàng
	public int soLuongKH(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean check = true;
		do {
			try {
				System.out.print("Nhập " + s + ": ");
				n = Integer.parseInt(sc.nextLine());
				check = false;
			} catch (NumberFormatException e) {
				System.out.println("Không đc nhập bậy !!!");
				check = true;
			}
		} while (check);
		return n;
	}

	// in thống kê
	public void inThongKe(Hotel item) {
		System.out.println(item.getLoaiPhong() + "\t\t" + item.getTienPhong() + " VND");
	}

	// nhập kiểu String
	public String inputStr(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String temp = "";
		System.out.print("Nhập " + s + ": ");
		temp = sc.nextLine();
		return temp;
	}

	public String loaiPhong(String soPhong) {
		return String.valueOf(soPhong.charAt(0));
	}

	public String tienPhong(String loaiPhong, String ngayDen, String ngayDi) {
		double tienPhong = 0;
		String[] A = ngayDen.split("/");
		int d = Integer.parseInt(A[0]);
		int m = Integer.parseInt(A[1]);
		int y = Integer.parseInt(A[2]);

		String[] B = ngayDi.split("/");
		int d1 = Integer.parseInt(B[0]);
		int m1 = Integer.parseInt(B[1]);
		int y1 = Integer.parseInt(B[2]);

		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();

		c1.set(y, m - 1, d);
		c2.set(y1, m1 - 1, d1);

		long ngayO = (c2.getTime().getTime() - c1.getTime().getTime()) / (24 * 3600 * 1000);
		int Dg = 0;
		if (loaiPhong.equals("A")) {
			Dg = 400000;
		} else if (loaiPhong.equals("B")) {
			Dg = 300000;
		} else {
			Dg = 250000;
		}
		tienPhong = Dg * ngayO;
		DecimalFormat decimalFormat = new DecimalFormat("###,###,###.00");
		return decimalFormat.format(tienPhong);

	}

}
