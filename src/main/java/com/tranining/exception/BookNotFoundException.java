package com.tranining.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BookNotFoundException extends RuntimeException {
	public BookNotFoundException(String arg0) {
		super(arg0);
	}

	public BookNotFoundException() {
		// TODO Auto-generated constructor stub
	}
}
