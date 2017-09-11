package learnclassabstract;

public class Zoo {

	public static void main(String[] args) {

		Animal item = new Animal() {

			@Override
			public void sayHello() {
				System.out.println("say...");
				// về nhà: Multiple Inheritance đa thừa kế => JAVA
				// what ?
				// what for
				// ẽample
				
			}
		};
		item.move(100);
		item.eat();

	}

}
