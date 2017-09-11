package rework;

public class Main {
	public static void main(String[] args) {
		StController item_contr = new StController();
		ReStudent[] itemRS = item_contr.inItem();
		item_contr.ouItem(itemRS);
	}
}
