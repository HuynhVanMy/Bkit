package exception;

public class AgeController {

	public static void main(String[] args) {
		try {
			validateAge(100);
		} catch (ProcessException e) {
		}
	}

	static void validateAge(int age) throws ProcessException {
		if (age < 18) {
			throw new ProcessException("Age is older than 18");
		}
	}

}
