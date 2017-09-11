package learnclass;

public class Animal {

	private int size;
	private int height;

	public void move(int speed){
		System.out.println("Animal.move(): calling !" + speed);
	}
	
	public void eat(){
		System.out.println("Animal.eat(): calling !");
	}
	
	public Animal() {

	}

	public Animal(int size, int height) {
		this.size = size;
		this.height = height;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Animal [size=" + size + ", height=" + height + "]";
	}

	
	
}
