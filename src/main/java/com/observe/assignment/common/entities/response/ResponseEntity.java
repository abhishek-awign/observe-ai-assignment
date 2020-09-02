package com.observe.assignment.common.entities.response;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseEntity<T> extends BaseResponse implements Serializable{
	
	public static final String SUCCESS = "Success";
    public static final String ERROR = "Error";
    
    @JsonProperty("data")
    private T data;

    public T getData() {
        return data;
    }

    private ResponseEntity(String message, String status, T data, Object errors) {
        super.message = message;
        this.status = status;
        this.data = data;
        this.errors = errors;
    }

    public static class Builder<T> {
        private String message;
        private String status;
        private T data;
        private Object errors;

        public Builder<T> setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder<T> setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder<T> setData(T data) {
            this.data = data;
            return this;
        }

        public Builder<T> setErrors(Object errors) {
            this.errors = errors;
            return this;
        }

        public ResponseEntity<T> build() {
            return new ResponseEntity<T>(message, status, data, errors);
        }
    }

}
