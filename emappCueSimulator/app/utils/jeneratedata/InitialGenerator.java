package utils.jeneratedata;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * Generates initials like A., B., etc.
 * 
 * @author Agustin Barto <abarto@gmail.com>
 */
public class InitialGenerator implements Generator<String> {
	/* (non-Javadoc)
	 * @see com.googlecode.jeneratedata.core.Generator#generate()
	 */
	@Override
	public String generate() {
		return RandomStringUtils.randomAlphabetic(1) + ".";
	}
}
