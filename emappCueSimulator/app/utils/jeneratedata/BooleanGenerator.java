package utils.jeneratedata;

import java.util.Random;


/**
 * Generates {@link Boolean} values using {@link Random#nextBoolean()} using
 * the wrapped {@link Random} instance.
 * 
 * @author Agustin Barto <abarto@gmail.com>
 */
public class BooleanGenerator extends RandomBasedGeneratorBase implements Generator<Boolean> {
	/* (non-Javadoc)
	 * @see com.googlecode.jeneratedata.core.Generator#generate()
	 */
	@Override
	public Boolean generate() {
		return random.nextBoolean();
	}
}
