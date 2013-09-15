package seahacks.exception;

public class ApplicationException extends AbstractSeahackException {

	private static final long serialVersionUID = -6045657410355471965L;

	public ApplicationException(Throwable throwable) {
		super(throwable.getMessage(), throwable);
	}

	public ApplicationException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public ApplicationException(String message) {
		super(message);
	}

	public ApplicationException(ErrorCode errorCode, String message, Throwable throwable) {
		super(errorCode, message, throwable);
	}

	public ApplicationException(ErrorCode errorCode) {
		super(errorCode);
	}

	public ApplicationException(ErrorCode errorCode, Throwable throwable) {
		super(errorCode, throwable.getMessage(), throwable);
	}

}
