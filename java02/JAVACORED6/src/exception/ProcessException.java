package exception;

public class ProcessException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProcessException(String msg) {
		super(msg);
		System.out.println("Im here !!! Let's check your mistake !");
	}

}
