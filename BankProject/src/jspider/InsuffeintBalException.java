package jspider;

public class InsuffeintBalException extends RuntimeException {
private String message;

public InsuffeintBalException(String message) {
	this.message = message;
}

@Override
public String getMessage() {
	return message;
}


}
