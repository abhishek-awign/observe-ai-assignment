package com.observe.assignment.service.domain;

import com.observe.assignment.model.data.Url;

public interface UrlService {
	
	Url getShortenedUrl(Url url);
	
	Url getOriginalUrl(String shortenedUrl);
	
	Integer getHitCount(String shortenedUrl);

}
