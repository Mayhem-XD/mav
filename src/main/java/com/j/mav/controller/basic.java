package com.j.mav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/basic")
public class basic {
	@RequestMapping("/basic01")
	public String basic01() {
		return "/basic01";
	}
	@ResponseBody
	@RequestMapping("/basic02")
	public String basic02() {
		return "<h1>문자열을 웹화면으로 보낼때 @ResponseBody 를 사용</h1>";
	}
}
