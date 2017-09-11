package bai03;

public class TinhThoiGian {

	private int gio;
	private int phut;
	private int giay;

	public TinhThoiGian() {
		// TODO Auto-generated constructor stub
	}

	public TinhThoiGian(int gio, int phut, int giay) {
		super();
		this.gio = gio;
		this.phut = phut;
		this.giay = giay;
	}

	@Override
	public String toString() {
		return "" + gio + " giờ " + phut + " phút " + giay + " giây";
	}

	public int getGio() {
		return gio;
	}

	public void setGio(int gio) {
		this.gio = gio;
	}

	public int getPhut() {
		return phut;
	}

	public void setPhut(int phut) {
		this.phut = phut;
	}

	public int getGiay() {
		return giay;
	}

	public void setGiay(int giay) {
		this.giay = giay;
	}

}
