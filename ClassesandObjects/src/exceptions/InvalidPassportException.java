package exceptions;

public class InvalidPassportException extends Exception {

	public InvalidPassportException() {
		super();
	}
	public InvalidPassportException(final String message) {		
		super(message);
	}
}