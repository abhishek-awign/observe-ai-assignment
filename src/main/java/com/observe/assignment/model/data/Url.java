package com.observe.assignment.model.data;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

public class Url implements Serializable{
	
	private String url;
	
	private long clientId;
	
	private String shortenedUrl;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public long getClientId() {
		return clientId;
	}
	public void setClientId(long clientId) {
		this.clientId = clientId;
	}
	public String getShortenedUrl() {
		return shortenedUrl;
	}
	public void setShortenedUrl(String shortenedUrl) {
		this.shortenedUrl = shortenedUrl;
	}
	
	

}
