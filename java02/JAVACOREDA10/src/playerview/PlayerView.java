package playerview;

import java.util.List;

import playerbean.Player;
import playercontroller.PlayerController;

public class PlayerView {

	public static void main(String[] args) {
		PlayerController controller = new PlayerController();
		List<Player> alItem = controller.inputData(3);
		System.out.println("Unsort--------------");
		controller.output(alItem);
		/*
		 * System.out.println("sortBysalary--------------"); alItem =
		 * controller.sortBysalary(alItem); controller.output(alItem);
		 * System.out.println("sortByName--------------"); alItem =
		 * controller.sortByName(alItem); controller.output(alItem);
		 */
		// Homework: sortBytime
		// Tạo arr[] các phần tử Player . sắp xếp theo fullname
		/** thêm player **/
		// B1: Nhập thông tin player muốn thêm => tự làm return ListPlayer
		// B2: Add player vào danh sách
		Player itemAdd = new Player("10", "Rooney", 30);
		// alItem = controller.add(alItem, itemAdd);
		if (controller.add(alItem, itemAdd) > 0) {
			System.out.println("Sucessful Addition !!!");
			controller.output(alItem);
		}
	}

}
