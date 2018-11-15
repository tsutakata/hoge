package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HogeController {
	
	@GetMapping("/hoge")
	@ResponseBody
	public String hoge() {
		return "hoge";
	}

}
