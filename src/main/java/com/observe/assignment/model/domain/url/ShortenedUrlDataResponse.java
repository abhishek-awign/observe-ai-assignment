package com.observe.assignment.model.domain.url;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.observe.assignment.model.data.Url;

public class ShortenedUrlDataResponse {
	
	@JsonProperty("url")
	private Url url;
	
	public ShortenedUrlDataResponse(Url url) {
		this.url = url;
	}

}
