package net.adamsmolnik.handler.exception;

/**
 * @author asmolnik
 *
 */
public class PhotoZipperHandlerException extends RuntimeException {

	private static final long serialVersionUID = 683392746684528822L;

	public PhotoZipperHandlerException(Exception e) {
		super(e);
	}
}
