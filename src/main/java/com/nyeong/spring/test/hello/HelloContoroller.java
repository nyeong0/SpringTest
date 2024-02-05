package com.nyeong.spring.test.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloContoroller {
	
	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "Hello ~ world ~ ";
	}
	
	
}
