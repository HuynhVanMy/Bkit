package bai02;

public class TimXauConChungDaiNhat_ver2 {

	public static void main(String[] args) {

		String s1 = "ABCEDEABBC";
		String s2 = "ABCEDCBBCK";
		String[] arr = new String[s1.length()];
		deleteNullArr(arr);
		int index = 0;
		int j = 0;
		///sai
		for (int i = 0; i < s1.length(); i++) {
			if (j < s2.length()) {
				if (s2.charAt(j++) == s1.charAt(i)) {
					arr[index] += s1.charAt(i);
					continue;
				} else {
					index++;
					j = 0;
				}
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
