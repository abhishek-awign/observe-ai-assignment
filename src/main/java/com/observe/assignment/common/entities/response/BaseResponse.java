package com.observe.assignment.common.entities.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseResponse implements Serializable{
	
	@JsonProperty("status")
    protected String status;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("message")
    protected String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("errors")
    protected Object errors;

    public BaseResponse() {
    }

    public BaseResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public BaseResponse(String status, String message, Object errors) {
        this.status = status;
        this.message = message;
        this.errors = errors;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public Object getErrors() {
        return errors;
    }

}
