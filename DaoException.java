package com1.fladykhw.jdbc.raw;

/**
 * SQLException을 wrapping하기 위한 RuntimeException.<br>
 * RuntimeException의 constructor들을 override 한다.
 * 
 * @author Jacob
 */
public class DaoException extends RuntimeException {
	public DaoException() {
		super();
	}

	public DaoException(String message) {
		super(message);
	}

	public DaoException(String message, Throwable cause) {
		super(message, cause);
	}

	public DaoException(Throwable cause) {
		super(cause);
	}

	public DaoException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}