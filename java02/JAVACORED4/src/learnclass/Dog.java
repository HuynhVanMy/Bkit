package learnclass;

public class Dog extends Animal {

	private boolean isBite;

	public void move() {
		super.move(100);
		System.out.println("Dog is moving !");
	}

	public void eat() {
		System.out.println("Dog is eating !");
	}

	public Dog() {

	}

	public Dog(int size, int height, boolean isBite) {
		super(size, height);
		this.isBite = isBite;
	}

	public boolean isBite() {
		return isBite;
	}

	public void setBite(boolean isBite) {
		this.isBite = isBite;
	}

	@Override
	public String toString() {
		return "Dog [isBite=" + isBite + ", getSize()=" + getSize() + ", getHeight()=" + getHeight() + "]";
	}

}
