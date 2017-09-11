package bai05;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Account {

	private String number;
	private  double balance;
	private String customerName;
	private String customerPhoneNumber;
	private String customerEmailAddress;
	
	public Account() {
	
	}
	
	public Account(String number, double balance, String customerName, String customerPhoneNumber,
			String customerEmailAddress) {
		super();
		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		this.customerPhoneNumber = customerPhoneNumber;
		this.customerEmailAddress = customerEmailAddress;
	}
	
	public Account(String customerName ,String customerPhoneNumber, String customerEmailAddress){
		this.customerName = customerName;
		this.customerPhoneNumber = customerPhoneNumber;
		this.customerEmailAddress = customerEmailAddress;
		this.balance = 50000;
		Random rd = new Random();
		this.number = "DADN-" + (rd.nextInt(888) + 111);
	}
	
	//nhập số tiền nộp/rút
	public double inputData(String s){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double n = 0;
		boolean checkN = true;
		do{
			try{
				System.out.print("Nhập số tiền muốn " + s + ": ");
				n = Double.parseDouble(sc.nextLine());
				checkN = false;
			}catch(NumberFormatException ex){
				System.out.println("Yêu cầu nhập đúng số tiền!");
				checkN = true;
			}
		}while(checkN);
		return n;
	}
	//nộp tiền
	public double deposit(){
		System.out.println("---------------");
		double tienNopVao;
		do{
			tienNopVao = inputData("nộp vào");
			if(tienNopVao < 100000){
				System.out.println("Tiền nộp vào phải nhiều hơn 100K!");
			}
		}while(tienNopVao < 100000 );
		return this.balance + tienNopVao;
	}
	
	//nộp tiền cách 2 - truyền đối số
	public double deposit02(double tienNopVao){
		if(tienNopVao < 100000){
			System.out.println("Tiền nộp vào phải nhiều hơn 100K!");
		}else{
			this.balance += tienNopVao;
		}
		return this.balance;
	}
	
	
	//rút tiền
	public double withdraw(){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------");
		if(this.balance < 100000){
			System.out.print("Tài khoản của bạn còn ít hơn 100k. Bạn có muốn nộp tiền? (co/ko):");
			String s = sc.nextLine();
			if(s.equals("co")){
				this.balance = deposit();
				System.out.println("Nộp tiền thành công. Hãy kiểm tra lại tài khoản của bạn!");
			}
		}else{
		double tienRut;
		do{
			tienRut = inputData("rút");
			if(tienRut < 100000){
				System.out.println("Tiền rút ra phải nhiều hơn 100K!");
			}else if(tienRut > this.balance){
				System.out.println("Số tiền rút Không hợp lệ !");
			}
		}while(tienRut < 100000 || tienRut > this.balance);
		this.balance -= tienRut;
		}
		return  this.balance;
	}
	
	//rút tiền cách 2 - truyền đối số
	 public double withdraw02(double tienRut){
		 if(tienRut < 100000){
				System.out.println("Tiền rút ra phải nhiều hơn 100K!");
			}else if(tienRut > this.balance){
				System.out.println("Số tiền rút Không hợp lệ !");
			}else{
				this.balance -= tienRut;
			}
		 return this.balance;
	 }
	
	
	//thông tin
	public void thongTinTK(){
		System.out.println("---------------");
		DecimalFormat df = new DecimalFormat("#,###,###,###.00");
		System.out.println("Số tiền hiện tại của bạn  là: "+ df.format(this.balance)  + " VND");
	}
	
	//menu
	public int menu(){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean check = true;
		System.out.println("*^*^*^*^*^*^*^*^*^*^*^*^*"
						  +"\n1. Kiểm Tra Thông Tin Tài Khoản."
						  +"\n2. Nộp tiền vào tài khoản"
						  +"\n3. Rút tiền."
						  +"\n4. Thoát.");
		do{
			try{
				System.out.print("Nhập yêu cầu của bạn theo số tương ứng: ");
				n = Integer.parseInt(sc.nextLine());
				check = false;
				if(n < 1 || n > 4){
					System.out.println("Không có chức năng này!");
					check = true;
				}
			}catch(NumberFormatException ex){
				System.out.println("Vui lòng nhập đúng chức năng!");
				check = true;
			}
		}while(check);
		return n;
	}
	
	
	//setter getter
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
			   +"\nSố tiền trong tài khoản: "+df.format(balance) + " VND";
	}
	
	
	
}
