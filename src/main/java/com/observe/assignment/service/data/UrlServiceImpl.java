package com.observe.assignment.service.data;

import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;

import com.observe.assignment.model.data.Url;
import com.observe.assignment.service.domain.UrlService;

@org.springframework.stereotype.Service
public class UrlServiceImpl implements UrlService {
	
	private static long id = 1; 
	private HashMap<String, Integer> hits = new HashMap<>();
	ArrayList<Url> urls = new ArrayList<>();
;
	@Override
	public Url getShortenedUrl(Url url) {
		for (Url iterable_url : urls) {
			if ((iterable_url.getUrl().equals(url.getUrl())) && (iterable_url.getClientId() == url.getClientId()))
				return iterable_url;
		}
		
		String shortened_url = Base64.getEncoder().encodeToString(Long.toString(id++).getBytes());
		url.setShortenedUrl(shortened_url);
		
		urls.add(url);
		
		return url;
		
	}

	@Override
	public Url getOriginalUrl(String shortenedUrl) {
		for (Url url : urls) {
			if (url.getShortenedUrl().equals(shortenedUrl)) {
				if (hits.containsKey(shortenedUrl))
					hits.put(shortenedUrl, (hits.get(shortenedUrl) + 1));
				else
					hits.put(shortenedUrl, 1);
				return url;
			}
		}
		
		return null;
	}

	@Override
	public Integer getHitCount(String shortenedUrl) {
		return hits.get(shortenedUrl);
	}

}
