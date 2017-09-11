package bai03;

public class Main {

	public static void main(String[] args) {

		Controlller ctrl = new Controlller();

		boolean check = true;
		do {
			int n = ctrl.menu();
			switch (n) {
			case 1:
				StudentAccount item = ctrl.inputData();
				ctrl.output(item);
				break;
			case 2:
				check = false;
			}

		} while (check);

	}

}
