package gpms.utils;
/**
 * Used for validating strings that the user of the application will pass in.
 * 3/23/17
 * @author Patrick Chapman
 *
 */
public class UserInputValidator {
	
	/**
	 * Validates arguments by checking for common XSS
	 * characters and tags.
	 * 
	 * @throws Exception, if illegal character or length is caught.
	 */
	public void validateInput(String userInput, int length) throws Exception{
		String userInputCopy = userInput.toLowerCase();
		//Allow alpha-numeric, punctuation, and whitespace
		if(!userInputCopy.matches("^[a-zA-z0-9,;.?\\s]*$") ||
		userInputCopy.contains("script")){
			throw new Exception("Invalid characters passed in.");
		}
		
		if((userInputCopy.length() > length) || (userInputCopy.length()) == 0){
			throw new Exception("Signature Field does not meet required length.");
		}
	}	
}
