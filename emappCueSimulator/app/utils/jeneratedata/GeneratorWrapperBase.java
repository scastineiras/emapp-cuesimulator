package utils.jeneratedata;

/**
 * An abstract class to be extended by classes that will process the values
 * generated by the wrapper {@link Generator} instance.
 * 
 * @author Agustin Barto <abarto@gmail.com>
 *
 * @param <T> Type of data items generated by the wrapped {@link Generator}. 
 */
public abstract class GeneratorWrapperBase<T> {
	/**
	 * The wrapped {@link Generator} instance to be used by the descendants of
	 * this class.
	 */
	protected Generator<T> generator;
	
	/**
	 * Constructor.
	 * 
	 * @param generator The wrapped {@link Generator} instance.
	 */
	public GeneratorWrapperBase(Generator<T> generator) {
		super();
		this.generator = generator;
	}
}
