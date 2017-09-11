package bai02bean;

public class Time {

	private int ngay;
	private int thang;
	private int nam;
	private int gio;
	private int phut;

	public Time() {

	}

	public Time(int ngay, int thang, int nam, int gio, int phut) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
		this.gio = gio;
		this.phut = phut;
	}

	@Override
	public String toString() {
		return ngay + "/" + thang + "/" + nam + " " + gio + ":" + phut;
	}

	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
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
}