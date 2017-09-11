package bean;

public class Main {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(1, "Huỳnh Văn Mỹ", 8, 8);
		SinhVien sv2 = new SinhVien(2, "Bạn Thân", 7, 9);
		SinhVien sv3 = new SinhVien();
		sv3.Nhap();
		System.out.println("MSSV |    Họ Tên    | Điểm LT| Điểm TH| Điểm TB  ");
		sv1.HienThi();
		sv2.HienThi();
		sv3.HienThi();
	}
}
