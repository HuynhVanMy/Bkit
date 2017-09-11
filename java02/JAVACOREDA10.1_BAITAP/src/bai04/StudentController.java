package bai04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentController {

	public int menu() {
		System.out.println("-----CÁC CHỨC NĂNG-----" + "\n1. Nhập danh sách sinh viên" + "\n2. Xem danh sách"
				+ "\n3/ Sắp xếp theo chiều tăng dần của điểm trung bình"
				+ "\n4. Sắp xếp danh sách sinh viên theo bằng chữ cái alphabet" + "\n5. Thêm sinh viên vào danh sách"
				+ "\n6. Tìm kiếm sinh viên theo mã" + "\n7. Xóa một sinh viên bị đuổi học khỏi danh sách"
				+ "\n8. Thoát");
		int n = (int) inputNumber("chức năng tương ứng");
		System.out.println();
		return n;
	}

	public void deleteStudent(List<Student> studentList) {
		String maSV = inputStr("mã sinh viên cần xóa");
		for (int i = 0; i < studentList.size(); i++) {
			if (maSV.equals(studentList.get(i).getMaSV())) {
				studentList.remove(studentList.get(i));
			} else if (i == studentList.size()) {
				System.out.println("Không có sinh viên cần xóa !!!");
			}
		}
		System.out.println();
	}

	public void findStudent(List<Student> studentList) {
		String maSV = inputStr("mã sinh viên cần tìm kiếm");
		for (int i = 0; i < studentList.size(); i++) {
			if (maSV.equals(studentList.get(i).getMaSV())) {
				System.out.println(studentList.get(i).toString());
			} else if (i == studentList.size()) {
				System.out.println("Not find !!!");
			}
		}
		System.out.println();
	}

	public void addStudent(List<Student> studentList) {
		int n = (int) inputNumber("số lượng sinh viên cần thêm vào");
		for (int i = 0; i < n; i++) {
			boolean check = true;
			do {
				Student tempItem = inputData();
				if (checkList(studentList, tempItem)) {
					studentList.add(tempItem);
					check = false;
				} else {
					System.out.println("Mã sinh viên đã tồn tại!!!");
					check = true;
				}
			} while (check);
		}
		System.out.println();
	}

	public void sortListAlphaBet(List<Student> studentList) {
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student itemOne, Student itemTwo) {
				return itemOne.getTenSV().compareToIgnoreCase(itemTwo.getTenSV());
			}
		});
	}

	public void sortListDiemTB(List<Student> studentList) {
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student itemOne, Student itemTwo) {
				return (int) itemOne.getDiemTB() - (int) itemTwo.getDiemTB();
			}
		});
	}

	public void outputData(List<Student> studentList) {
		System.out.println("Mã SV" + "\tTên SV" + "\t\t Ngày sinh" + "\t\t ĐiểmLT" + "\t ĐiểmTH" + "\t ĐiểmTB");
		for (Student item : studentList) {
			System.out.println(item.toString());
		}
		System.out.println();
	}

	public List<Student> listStudent() {
		List<Student> studentList = new ArrayList<Student>();
		int n = (int) inputNumber("số lượng sinh viên");
		for (int i = 0; i < n; i++) {
			boolean check = true;
			do {
				Student tempItem = inputData();
				if (checkList(studentList, tempItem)) {
					studentList.add(tempItem);
					check = false;
				} else {
					System.out.println("Mã sinh viên đã tồn tại!!!");
					check = true;
				}
			} while (check);
			System.out.println();
		}
		System.out.println();
		return studentList;
	}

	public boolean checkList(List<Student> studentList, Student st) {
		for (int i = 0; i < studentList.size(); i++) {
			if (st.getMaSV().equals(studentList.get(i).getMaSV())) {
				return false;
			}
		}
		return true;
	}

	public Student inputData() {
		String maSV = inputStr("mã sinh viên");
		String tenSV = inputStr("tên sinh viên");
		String ngaySinh = inputStr("ngày sinh(dd/MM/yyy)");
		float diemLT = inputNumber("điểm lí thuyết");
		float diemTH = inputNumber("điểm thực hành");
		float diemTB = diemTB(diemLT, diemTH);
		Student item = new Student(maSV, tenSV, ngaySinh, diemLT, diemTH, diemTB);
		return item;
	}

	public float diemTB(float diemLT, float diemTH) {
		return (diemLT + diemTH) / 2;
	}

	public String inputStr(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str = "";
		System.out.print("Nhập " + s + ": ");
		str = sc.nextLine();
		return str;
	}

	public float inputNumber(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		float n = 0;
		boolean flag = true;
		do {
			try {
				System.out.print("Nhập " + s + ": ");
				n = Float.parseFloat(sc.nextLine());
				flag = false;
			} catch (NumberFormatException e) {
				System.out.println("Nonsense!!!");
				flag = true;
			}
		} while (flag);
		return n;
	}

}
