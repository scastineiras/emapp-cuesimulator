package utils.jeneratedata;

/**
 * Converts the input to upper case.
 * 
 * @author Agustin Barto <abarto@gmail.com>
 */
public class ToUpperCaseTransformer implements Transformer<String, String> {
	/* (non-Javadoc)
	 * @see com.googlecode.jeneratedata.util.Transformer#transform(java.lang.Object)
	 */
	@Override
	public String transform(String input) {
		return input.toUpperCase();
	}
}
