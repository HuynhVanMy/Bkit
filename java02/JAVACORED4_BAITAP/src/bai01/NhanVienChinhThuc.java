package bai01;

public class NhanVienChinhThuc extends NhanVien {
	public int x;
	
	public NhanVienChinhThuc(String ten, String cmnd, int x) {
		super();
		this.x = x;
		setTen(ten);
		setCmnd(cmnd);
	}

	public NhanVienChinhThuc(int x) {
		super();
		this.x = x;
	}
	
	public NhanVienChinhThuc() {
		super();
	}
	
	public int xuatLuong(){
		return super.xuatLuong();
		
	}
	
	public boolean checkHopDong(){
		
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + "NhanVienChinhThuc [x=" + x + "]";
	}

	
	
}
