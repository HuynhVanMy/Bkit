package ex03;

public class Ex02 {

	public static void main(String[] args) {

		String s1 = "  		Do  ; you , ? like . learning - java?";
		s1 = s1.trim();
		String[] arrs = s1.split("[ ; .? , \\- +]+");// Không phải regex
		for (String item : arrs) {
			System.out.print(item + " ");
		}

		System.out.println("\n-----------");
		String s = "Yes, i like it";
		System.out.println(s.length());
		System.out.println("--------------");
		
		String s2 = "ab1CD2eFw!@#74m%";
		char[] arrs2 = s2.toCharArray();
		int countNumber = 0;
		int countA = 0;
		int counta = 0;
	//	int count = 0;//ki tu dac biet
		for(int i = 0; i < arrs2.length; i++){
			if(Character.isDigit(arrs2[i])){
				countNumber++;
			}else if(Character.isLowerCase(arrs2[i])){
				counta++;
			} else if (Character.isUpperCase(arrs2[i])) {
				countA++;
			}
		}
		System.out.println(countNumber);
		System.out.println(counta);
		System.out.println(countA);
		//System.out.println(count);
	}

}
