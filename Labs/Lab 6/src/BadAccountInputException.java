public class BadAccountInputException extends java.lang.RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public BadAccountInputException() {
		this("Exception occurs");
	} // no-arg constructor
	public  BadAccountInputException(String message) {
		super(message);
	}
}