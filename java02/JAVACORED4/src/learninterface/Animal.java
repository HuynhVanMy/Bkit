package learninterface;

public interface Animal {
	/*
	 * chỉ là giao diện, không có khả năng tự định nghĩa. cần nhờ class con định
	 * nghĩa
	 * tất cả là vì ko có khả năng tự định nghĩa
	 * lớp con tự do định nghĩa lại của cha
	 */

	public int size = 0;
	public int height = 0;

	public void move();
	public void eat();

}
