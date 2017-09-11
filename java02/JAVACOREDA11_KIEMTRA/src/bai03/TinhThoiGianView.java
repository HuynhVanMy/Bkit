package bai03;

public class TinhThoiGianView {

	public static void main(String[] args) {
		TinhThoiGianController controller = new TinhThoiGianController();
		TinhThoiGian timeOne = new TinhThoiGian(3, 28, 47);
		TinhThoiGian timeTwo = new TinhThoiGian(5, 40, 12);
		TinhThoiGian time = controller.tinh(timeOne, timeTwo);
		controller.output(time);

	}

}
