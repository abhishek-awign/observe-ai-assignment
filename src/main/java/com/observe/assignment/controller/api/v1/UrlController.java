package com.observe.assignment.controller.api.v1;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.observe.assignment.common.entities.response.ResponseEntity;
import com.observe.assignment.common.entities.response.RestException;
import com.observe.assignment.model.data.Url;
import com.observe.assignment.model.domain.url.OriginalUrlDataResponse;
import com.observe.assignment.model.domain.url.ShortenedUrlDataResponse;
import com.observe.assignment.service.domain.UrlService;

@RestController
@RequestMapping("/api/v1/urls")
public class UrlController {
	
	private UrlService urlService;
	
	@Autowired
	public UrlController(UrlService urlService) {
		this.urlService = urlService;
	}
	
	@RequestMapping(path = "/getShortenedUrl", method = RequestMethod.POST, consumes = "application/json")
	@ResponseBody
	public ResponseEntity<ShortenedUrlDataResponse> getShortenedUrl(@RequestBody Url url) throws RestException{
		return new ResponseEntity.Builder<ShortenedUrlDataResponse>()
                .setStatus(ResponseEntity.SUCCESS)
                .setMessage("Shortened URL")
                .setData(new ShortenedUrlDataResponse(urlService.getShortenedUrl(url)))
                .build();
	}
	
	@RequestMapping(path = "/getOriginalUrl/{shortenedUrl}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<OriginalUrlDataResponse> getOriginalUrl(@PathVariable String shortenedUrl) throws RestException{
		return new ResponseEntity.Builder<OriginalUrlDataResponse>()
				.setStatus(ResponseEntity.SUCCESS)
				.setMessage("Original Url")
				.setData(new OriginalUrlDataResponse(urlService.getOriginalUrl(shortenedUrl)))
				.build();
	}
	
	@RequestMapping(path = "/getHitCount/{shortenedUrl}", method = RequestMethod.GET, produces = "application/json")
	public Integer getHitCount(@PathVariable String shortenedUrl) throws RestException{
		return urlService.getHitCount(shortenedUrl);
	}

}
