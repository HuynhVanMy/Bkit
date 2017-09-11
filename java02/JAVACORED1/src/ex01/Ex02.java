package ex01;

public class Ex02 {
	//Thuộc tính
	public int a1;
	protected int a3;
	
	public static void main(String[] args) {
		// Alias Java cơ chế thu gom rác trong java
		//Biến va thuộc tính arg 
		//Hàm và phương thức
		int a = 5;
		int b = a;
		b = 10;
		System.out.println(a);
		System.out.println(b);
		
		HocSinh hsA = new HocSinh("Le nam");
		HocSinh hsB = hsA;
		hsB.hoTen = "truong tu";
	}
}
