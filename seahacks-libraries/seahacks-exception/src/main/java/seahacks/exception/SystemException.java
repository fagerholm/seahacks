package seahacks.exception;

public class SystemException extends AbstractSeahackException {

	private static final long serialVersionUID = 7949068378129193644L;

	public SystemException(Throwable throwable) {
		super(throwable.getMessage(), throwable);
	}

	public SystemException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public SystemException(String message) {
		super(message);
	}

	public SystemException(ErrorCode errorCode, String message, Throwable throwable) {
		super(errorCode, message, throwable);
	}

	public SystemException(ErrorCode errorCode) {
		super(errorCode);
	}

	public SystemException(ErrorCode errorCode, Throwable throwable) {
		super(errorCode, throwable.getMessage(), throwable);
	}
}
