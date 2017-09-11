package playerbean;

import java.text.DecimalFormat;

public class Player01 {
	private int number;
	private String fullName;
	private double salary;

	public Player01() {
		// TODO Auto-generated constructor stub
	}

	public Player01(int number, String fullName, double salary) {
		super();
		this.number = number;
		this.fullName = fullName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		DecimalFormat decimalFormat = new DecimalFormat("#,###.000");
		return "Number: " + number + "\tFullName: " + fullName + "\t\tSalary: " + decimalFormat.format(salary) + " EUR";
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}