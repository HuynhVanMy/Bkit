package bai05;

public class Bai05 {

	public static void main(String[] args) {
		String s = "12301579320123456789";
		String[] arrStr = new String[s.length()];
		nullStr(arrStr);
		int index = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i + 1 != s.length()) {
				if (Integer.parseInt(String.valueOf(s.charAt(i))) <= Integer
						.parseInt(String.valueOf(s.charAt(i + 1)))) {
					arrStr[index] += s.charAt(i);
				} else {
					arrStr[index++] += s.charAt(i);
				}
			} else {
				arrStr[index] += s.charAt(i);
			}
		}
		for (int i = 0; i <= index; i++) {
			System.out.println(arrStr[i]);
		}
		System.out.println("-------------");
		System.out.println(maxStr(arrStr));

	}

	private static String maxStr(String[] arrStr) {
		String max = arrStr[0];
		for (int i = 0; i < arrStr.length; i++) {
			if (arrStr[i].length() > max.length()) {
				max = arrStr[i];
			}
		}
		return max;
	}

	private static void nullStr(String[] arrStr) {
		for (int i = 0; i < arrStr.length; i++) {
			arrStr[i] = "";
		}
	}

}
