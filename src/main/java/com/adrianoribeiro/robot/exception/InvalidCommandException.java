package com.adrianoribeiro.robot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="Invalid command")
public class InvalidCommandException extends RuntimeException {

	private static final long serialVersionUID = -6306440741216652738L;
	

}
