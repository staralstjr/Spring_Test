package com.staralstjr.spring.lesson05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lesson05")
@Controller
public class lesson05Controller {
	@GetMapping("/test01")
	public String test01() {
		return "lesson05/MarondalEx01";
	}
}
