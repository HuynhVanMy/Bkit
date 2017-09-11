package learningvecter;

import java.util.Vector;

public class Ex01 {

	public static void main(String[] args) {
		Vector<Integer> vectorA = new Vector<Integer>(5, 2);
		vectorA.add(5);
		vectorA.add(7);
		vectorA.add(10);
		vectorA.add(1);
		vectorA.add(4);
		for (int i = 0; i < vectorA.size(); i++) {
			System.out.println(vectorA.get(i));
		}
	}

}
