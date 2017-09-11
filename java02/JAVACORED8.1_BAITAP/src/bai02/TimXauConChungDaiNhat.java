package bai02;

/**
 * cần chỉnh sửa lại cho tối ưu
 **/
public class TimXauConChungDaiNhat {

	public static void main(String[] args) {
		String s1 = "ABCEDEABC";
		String s2 = "ABCEDCBBCK";
		int length = s1.length();
		if (s1.length() > s2.length()) {
			length = s2.length();
		}
		String[] arr = new String[length];
		deleteNullArr(arr);
		int index = 0;
		for (int i = 0; i < length; i++) {
			if (s1.charAt(i) == s2.charAt(i)) {
				arr[index] += s1.charAt(i);
			} else {
				index++;
			}
		}
		for (int i = 0; i <= index; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-------------");
		System.out.println(maxStr(arr));
	}

	public static String maxStr(String[] arr) {
		String max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > max.length()) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void deleteNullArr(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = "";
		}
	}

}
