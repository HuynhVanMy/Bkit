package bai08;

import java.util.Scanner;

public class Bai08 {
	public static void main(String[] args) throws InterruptedException {

		output();
		
	}

	public static void output() throws InterruptedException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String a = "Điều 1: Tau luôn đúng. Tau không sai";
		String b = "Tau có sai không (co/ko): ";
		String c = "Ngoan lắm Mày :*";
		String d = "Mày có điều gì muốn nói với Tao không (co/ko) ?";
		String e = "Mày nhập điều muốn nói với Tau đi.";
		String f = "Vậy thì im luôn đi nhe cưng.";
		String g = "Trả lời kiểu gì thế >_<";
		String h = "Tau yêu người khác rồi :v";
		String i = "Mày phải luôn yêu tao nà :D";
		String k = "Mày có yêu tao không (co/ko)?";
		String l = "Tau thì không yêu mày. Quê chưa con.";
		boolean Check = true;
		do {
			System.out.print("\nMày lựa chọn điều mấy: ");
			int choose = Integer.parseInt(sc.nextLine());
			switch (choose) {
			case 1:
				System.out.println(a);
				break;
			case 2:
				System.out.print(b);
				String s2 = sc.nextLine();
				if (s2.equals("co")) {
					System.out.println(a);
					break;
				} else {
					System.out.println(c);
					break;
				}
			case 3:
				System.out.println(d);
				String s3 = sc.nextLine();
				if (s3.equals("co")) {
					System.out.println(e);
					sc.nextLine();
				} else if (s3.equals("ko")) {
					System.out.println(f);
				} else {
					System.out.println(g);
				}
				Thread.sleep(10000);
				System.out.println(h);
				break;

			case 4:
			case 5:
				System.out.println(a);
				break;
			case 6:
				System.out.println(i);
			case 7:
				System.out.println(k);
				String s7 = sc.nextLine();
				if (s7.equals("co")) {
					System.out.println(l);
				} else if (s7.equals("ko")) {
					System.out.println(i);
				} else {
					System.out.println(g);
				}
			}
			System.out.print("Mày có muốn chơi tiếp không (co/ko)?  ");
			String s = sc.nextLine();
			if (s.equals("co")) {
				Check = true;
			} else if (s.equals("ko")) {
				Check = false;
			} else {
				System.out.println("Trả lời bậy hả con. Nghỉ chơi nhé.");
				Check = false;
			}
		} while (Check);
		System.out.println("\n=>=>=>=> G A M E   O V E R <=<=<=<=");
	}
}
