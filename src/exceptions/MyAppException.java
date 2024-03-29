package exceptions;

public class MyAppException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private String message = null;

	public MyAppException() {
		super();
	}

	public MyAppException(String message) {
		super(message);
		this.message = message;
	}

	public MyAppException(Throwable clause) {
		super(clause);
	}

	@Override
	public String toString() {
		return message;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
