package playerbean;

public class Player {

	private String number;
	private String fullname;
	private double salary;

	public Player() {
	}

	public Player(String number, String fullname, double salary) {
		super();
		this.number = number;
		this.fullname = fullname;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Player [number=" + number + ", fullname=" + fullname + ", salary=" + salary + "]";
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
