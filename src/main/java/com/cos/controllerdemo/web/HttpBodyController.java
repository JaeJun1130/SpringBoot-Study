package com.cos.controllerdemo.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.controllerdemo.domain.User;

@RestController
public class HttpBodyController {

	
	private static final Logger log = LoggerFactory.getLogger(HttpBodyController.class);

	/**
	 * header 의 Content-Type 은 대표적으로 3가지가 있다.
	 * 1. x-www-form-urlencoded (key=value)
	 * 2. text/plain			(안녕)
	 * 3. application/json		({"username":"hhh"})
	 */
	@PostMapping("/body1")
	public String xwwwformurlencoded(String username) {
		log.info(username);
		return "key=value 전송옴";
	}
	
	@PostMapping("/body2")
	public String plaintext(@RequestBody String data) { // 평문: 안녕
		log.info(data);
		return "plain/text 전송옴";
	}
	
	@PostMapping("/body3")
	public String applicationjson(@RequestBody String data) {
		log.info(data);
		return "json 전송옴";
	}
	
	@PostMapping("/body4")
	public String applicationjsonToObject(@RequestBody User user) {
		//Vo 객체로 받으면 원하는 JSON 값을 get 할 수 있다
		log.info(user.getUsername());
		return "json 전송옴";
	}
}
