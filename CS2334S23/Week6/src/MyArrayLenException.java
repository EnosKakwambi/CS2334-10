


public class MyArrayLenException extends Exception
{
	/**
	 * Returns an Image object that can then be painted on the screen. 
	 * The url argument must specify an absolute . The name
	 * argument is a specifier that is relative to the url argument. 
	 * This method always returns immediately, whether or not the 
	 * image exists. When this applet attempts to draw the image on
	 * the screen, the data will be loaded. The graphics primitives 
	 * that draw the image will incrementally paint on the screen. 
	 *
	 * @param  message  message passed as argument
	 */
	public MyArrayLenException(String message) {
		super(message);
	}

}
