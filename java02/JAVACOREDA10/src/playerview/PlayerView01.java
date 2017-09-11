package playerview;

import java.util.List;

import playerbean.Player01;
import playercontroller.PlayerController01;

public class PlayerView01 {

	public static void main(String[] args) {
		PlayerController01 controller = new PlayerController01();
		List<Player01> list = controller.inputData();
		controller.output(list);
		System.out.println("\n1. sortByNumber-----------");
		list = controller.sortByNumber(list);
		controller.output(list);
		System.out.println("\n2. sortByFullName---------");
		list = controller.sortByFullName(list);
		controller.output(list);
		System.out.println("\n3. sortBySalary-----------");
		list = controller.sortBySalary(list);
		controller.output(list);
	}

}
