package com.observe.assignment.common.entities.response;

import org.springframework.http.HttpStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RestException extends Exception{
	
	@JsonProperty("status")
	private HttpStatus httpStatus;
	
	@JsonProperty("message")
	private String message;
	
	public RestException(HttpStatus httpStatus, String message) {
        super(message);
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public RestException(HttpStatus httpStatus, String message, Throwable cause) {
        super(message, cause);
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
