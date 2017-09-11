package learnclass;

public class Zoo {

	public static void main(String[] args) {

		Animal item = new Animal(50, 100);
		System.out.println(item.toString());

		Dog linhDog = new Dog(50, 100, true);
		linhDog.eat();
		linhDog.move();
		System.out.println(linhDog.toString());

	}

}
