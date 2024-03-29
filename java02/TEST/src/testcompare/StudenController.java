package testcompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudenController {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "mỹ", 8.5));
		list.add(new Student(5, "chiến", 7.5));
		list.add(new Student(3, "lập", 9.5));
		list.add(new Student(6, "nguyên", 6.5));
		list.add(new Student(2, "linh", 8.5));

		System.out.println("ban đầu");
		output(list);
		System.out.println("\nAfter sortByComparator  - điểm && name");
		list = sortByComparator(list);
		output(list);

		System.out.println("\nAfter sortByComparable - id");
		list = sortByComparable(list);
		output(list);
	}

	public static void output(List<Student> list) {
		System.out.println("id\tname\tđiểm");
		System.out.println();
		for (Student student : list) {
			System.out.println(student.toString());
		}
	}

	// sắp xếp theo điểm và tên
	public static List<Student> sortByComparator(List<Student> list) {
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				int diem = (int) (o1.getDiem() - o2.getDiem());
				if (diem == 0) {
					return o1.getName().compareToIgnoreCase(o2.getName());
				} else {
					return diem;
				}
			}

		});

		return list;
	}

	// sắp xếp theo id
	public static List<Student> sortByComparable(List<Student> list) {
		Collections.sort(list);
		return list;
	}

}









