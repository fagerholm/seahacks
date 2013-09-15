package seahacks.exception;

public abstract class AbstractSeahackException extends RuntimeException implements SeahackException {

	private static final long serialVersionUID = 9147351145303082229L;

	private ErrorCode errorCode;

	public ErrorCode getErrorCode() {
		return errorCode;
	}
	
	public AbstractSeahackException(String message){
		super(message);
	}

	public AbstractSeahackException(String message, Throwable throwable){
		super(message, throwable);
	}

	public AbstractSeahackException(ErrorCode errorCode, String message, Throwable throwable){
		super(message, throwable);
		this.errorCode = errorCode;
	}
	
	public AbstractSeahackException(ErrorCode errorCode){
		super();
		this.errorCode = errorCode;
	}
	
	

}
