package bai08;

public class Hotel {

	private String maHoaDon;
	private String tenKhachHang;
	private String soChungMinh;
	private String gioiTinh;
	private String soPhong;
	private String loaiPhong;
	private String ngayDen;
	private String ngayDi;
	private String tienPhong;

	public Hotel() {

	}

	public Hotel(String maHoaDon, String tenKhachHang, String soChungMinh, String gioiTinh, String soPhong,
			String loaiPhong, String ngayDen, String ngayDi, String tienPhong) {
		this.maHoaDon = maHoaDon;
		this.tenKhachHang = tenKhachHang;
		this.soChungMinh = soChungMinh;
		this.gioiTinh = gioiTinh;
		this.soPhong = soPhong;
		this.loaiPhong = loaiPhong;
		this.ngayDen = ngayDen;
		this.ngayDi = ngayDi;
		this.tienPhong = tienPhong;
	}

	@Override
	public String toString() {
		return "Mã hóa đơn: " + maHoaDon + "\nTên khách hàng: " + tenKhachHang + "\nSố chứng minh: " + soChungMinh
				+ "\nGiới tính: " + gioiTinh + "\nSố phòng: " + soPhong + "\nLoại phòng: " + loaiPhong + "\nNgày đến: "
				+ ngayDen + "\nNgày đi: " + ngayDi + "\nTiền phòng: " + tienPhong + " VNĐ";
	}

	public String getMaHoaDon() {
		return maHoaDon;
	}

	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}

	public String getTenKhachHang() {
		return tenKhachHang;
	}

	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}

	public String getSoChungMinh() {
		return soChungMinh;
	}

	public void setSoChungMinh(String soChungMinh) {
		this.soChungMinh = soChungMinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getSoPhong() {
		return soPhong;
	}

	public void setSoPhong(String soPhong) {
		this.soPhong = soPhong;
	}

	public String getLoaiPhong() {
		return loaiPhong;
	}

	public void setLoaiPhong(String loaiPhong) {
		this.loaiPhong = loaiPhong;
	}

	public String getNgayDen() {
		return ngayDen;
	}

	public void setNgayDen(String ngayDen) {
		this.ngayDen = ngayDen;
	}

	public String getNgayDi() {
		return ngayDi;
	}

	public void setNgayDi(String ngayDi) {
		this.ngayDi = ngayDi;
	}

	public String getTienPhong() {
		return tienPhong;
	}

	public void setTienPhong(String tienPhong) {
		this.tienPhong = tienPhong;
	}

}
