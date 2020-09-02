package com.observe.assignment.model.domain.url;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.observe.assignment.model.data.Url;

public class OriginalUrlDataResponse {
	
	@JsonProperty("url")
	private Url url;
	
	public OriginalUrlDataResponse(Url url) {
		this.url = url;
	}

}
