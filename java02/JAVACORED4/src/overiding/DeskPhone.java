package overiding;

public class DeskPhone extends Phone {
	
	public void typing() {
		System.out.print("type keyboard !");
	}

	@Override
	public void calling() {
		System.out.println("DeskPhone calling");
	}

	public static void main(String[] args) {
		DeskPhone deskitem  = new DeskPhone();
		deskitem.calling();
	}

}

class Phone {
	public void calling() {
		System.out.println("Phone calling !");
	}
}