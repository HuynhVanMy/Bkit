package rework;

import java.util.Calendar;

/*
 * Nhập vào tên, năm sinh, in ra số BD, tuổi
 * 
 * */
public class ReStudent {

	private String id; // số báo danh
	private String fullName; // Tên
	private int dayOfBirth; // năm sinh
	private float diemLT;
	private float diemTH;
	private float diemTB;

	public ReStudent() {

	}

	/*
	 * public ReStudent(String id, String fullName, int dayOfBirth) { super();
	 * this.id = id; this.fullName = fullName; this.dayOfBirth = dayOfBirth; }
	 */
	public ReStudent(String id, String fullName, int dayOfBirth, float diemLT, float diemTH, float diemTB) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.dayOfBirth = dayOfBirth;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
		this.diemTB = diemTB;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(int dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	public float getDiemLT() {
		return diemLT;
	}

	public void setDiemLT(float diemLT) {
		this.diemLT = diemLT;
	}

	public float getDiemTH() {
		return diemTH;
	}

	public void setDiemTH(float diemTH) {
		this.diemTH = diemTH;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}

	public String toString() {
		int calendar = Calendar.getInstance().get(Calendar.YEAR);
		return id + "\t" + fullName + "\t" + (calendar - dayOfBirth) + "\t" + diemLT + "\t" + diemTH + "\t"
				+ diemTB;
	}
}
