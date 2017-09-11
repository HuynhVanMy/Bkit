package bai01;

public class Ex01 {
	public static void main(String[] args) {
		String norStr1 = "Le Na";
		String norStr2 = norStr1;
		norStr1 = "Le Van Nam";
		System.out.println(norStr2);

		System.out.println("---------------");

		String objStr1 = new String("Le Phan");
		String objStr2 = objStr1;
		objStr1 = "Dang Van Nam";
		System.out.println(objStr2);

		System.out.println("---------------");

		HocSinh hs1 = new HocSinh("Le Phan");
		HocSinh hs2 = hs1;
		hs2.setHoten("Dang Van Nam");
		System.out.println(hs1);
	}

}

class HocSinh {
	private String hoten;

	public HocSinh(String hoten) {
		this.hoten = hoten;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

}