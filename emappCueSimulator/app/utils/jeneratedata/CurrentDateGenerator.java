package utils.jeneratedata;

import java.util.Date;

/**
 * Generates {@link Date} with the current date/time upon each call to
 * {@link #generate()}.
 * 
 * @author Agustin Barto <abarto@gmail.com>
 */
public class CurrentDateGenerator implements Generator<Date> {
	/* (non-Javadoc)
	 * @see com.googlecode.jeneratedata.core.Generator#generate()
	 */
	@Override
	public Date generate() {
		return new Date();
	}
}
