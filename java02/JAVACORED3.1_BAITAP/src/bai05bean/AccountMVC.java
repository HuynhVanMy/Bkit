package bai05bean;

import java.text.DecimalFormat;
import java.util.Random;

public class AccountMVC {
	
	private String number;
	private  double balance;
	private String customerName;
	private String customerPhoneNumber;
	private String customerEmailAddress;
	
	public AccountMVC() {
		
	}
	
	public AccountMVC(String number, double balance, String customerName, String customerPhoneNumber,
			String customerEmailAddress) {
		super();
		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		this.customerPhoneNumber = customerPhoneNumber;
		this.customerEmailAddress = customerEmailAddress;
	}

	public AccountMVC(String customerName ,String customerPhoneNumber, String customerEmailAddress){
		this.customerName = customerName;
		this.customerPhoneNumber = customerPhoneNumber;
		this.customerEmailAddress = customerEmailAddress;
		this.balance = 50000;
		Random rd = new Random();
		this.number = "DADN-" + (rd.nextInt(888) + 111);
	}
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}
	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###,###,###.00");
		return  "Tên Tài Khoản: "+ customerName
			   +"\nSố Tài Khoản: "+number
			   +"\nĐịa Chỉ Mail: "+ customerEmailAddress
			   +"\nSố Điện Thoại: "+customerPhoneNumber
			   +"\nSố tiền trong tài khoản: "+df.format(this.balance)  + " VND";
	}
	
}
