package bai06;

public class Main {

	public static void main(String[] args) {
		YenNgua item = new YenNgua();

		int m = item.checkData("số hàng");
		int n = item.checkData("số cột");

		int[][] A = new int[m][n];

		A = item.inputData(A);
		item.output(A);
		item.kiemTra(A);
	}

}
