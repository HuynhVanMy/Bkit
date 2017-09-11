package bai03;

public class TinhThoiGianController {

	public void output(TinhThoiGian time) {
		System.out.println(time.toString());
	}

	public TinhThoiGian tinh(TinhThoiGian timeOne, TinhThoiGian timeTwo) {
		TinhThoiGian time = new TinhThoiGian();
		if (timeTwo.getGiay() >= timeOne.getGiay()) {
			time.setGiay(timeTwo.getGiay() - timeOne.getGiay());
		} else if (timeTwo.getGiay() < timeOne.getGiay()) {
			time.setGiay(timeTwo.getGiay() + 60 - timeOne.getGiay());
			timeTwo.setPhut(timeTwo.getPhut() - 1);
		}
		if (timeTwo.getPhut() >= timeOne.getPhut()) {
			time.setPhut(timeTwo.getPhut() - timeOne.getPhut());
		} else if (timeTwo.getPhut() < timeOne.getPhut()) {
			time.setPhut(timeTwo.getPhut() + 60 - timeOne.getPhut());
			timeTwo.setGio(timeTwo.getGio() - 1);
		}
		time.setGio(timeTwo.getGio() - timeOne.getGio());
		return time;
	}

}
