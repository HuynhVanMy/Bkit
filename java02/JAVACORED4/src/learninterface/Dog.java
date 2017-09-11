package learninterface;

public class Dog implements Animal {

	private boolean isBite;
	
	public void isBiteAble(){
		if(this.isBite){
			System.out.println("Lập is a dog");
		}else{
			System.out.println("Lập not is a dog");
		}
	}

	public boolean isBite() {
		return isBite;
	}

	public void setBite(boolean isBite) {
		this.isBite = isBite;
	}

	public void move(){
		System.out.println("Dog is moving");
	}

	@Override
	public void eat() {
		System.out.println("Dog is eating !");
	}

}
