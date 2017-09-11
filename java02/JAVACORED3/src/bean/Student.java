package bean;

public class Student {

	/*
	 * Nhập vào họ tên, năm sinh => xuất SBD, hoten, tuoi.
	 * */
	private String id;
	private String fullName;
	private int dateOfbirth;
	
	public Student() {

	}
	
	
	public Student(String id, String fullName, int dateOfbirth) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.dateOfbirth = dateOfbirth;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getDateOfbirth() {
		return dateOfbirth;
	}
	public void setDateOfbirth(int dateofbirth) {
		this.dateOfbirth = dateofbirth;
	}


	@Override
	public String toString() {
		
		return "Student [id=" + id + ", fullName=" + fullName + ", dateofbirth=" + dateOfbirth + ""
				+ ", age ="+(2017-this.dateOfbirth)+"]";
	}
	
	
}
