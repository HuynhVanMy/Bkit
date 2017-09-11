package learninterface;

public class Zoo {

	public static void main(String[] args) {

		Dog lapDog = new Dog();
		lapDog.setBite(false);
		
		lapDog.move();
		lapDog.eat();
		lapDog.isBiteAble();

		System.out.println("---------------");
		Animal item = new Dog();
		//item.setBite(false);
		
		item.move();
		item.eat();
		//item.isBiteAble();
		
	
		
		
	}

}
