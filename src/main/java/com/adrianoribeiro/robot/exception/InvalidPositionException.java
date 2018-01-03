package com.adrianoribeiro.robot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="Invalid position")
public class InvalidPositionException extends RuntimeException {

	private static final long serialVersionUID = 7130299568300303711L;

}
