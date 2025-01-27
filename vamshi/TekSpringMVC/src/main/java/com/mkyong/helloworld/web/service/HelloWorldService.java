package com.mkyong.helloworld.web.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class HelloWorldService {

	public String getDesc( String desc) {
		return "Hello : "+ desc;
	}

	public String getTitle(String name) {
		if(StringUtils.isEmpty(name)){
			return "Hello World";
		}else{
			return "Hello " + name;
		}

	}
}
