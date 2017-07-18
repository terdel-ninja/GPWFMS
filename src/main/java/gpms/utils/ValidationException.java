package gpms.utils;

@SuppressWarnings("serial")
public class ValidationException extends Exception {
	public ValidationException(){
		super();
	}
	
	public ValidationException(String message){
		super("Validation Exception: " + message);
	}
}
