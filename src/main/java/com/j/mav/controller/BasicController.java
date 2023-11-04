package com.j.mav.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/basic")
public class BasicController {
	@RequestMapping("/basic01")
	public String basic01() {
		return "/basic01";
	}
	@ResponseBody
	@RequestMapping("/basic02")
	public String basic02() {
		return "<h1>문자열을 웹화면으로 보낼때 @ResponseBody 를 사용</h1>";
	}
	@RequestMapping("/basic3")
	public String basic3(Model model) {
		model.addAttribute("filename", "basic3.jsp");
		model.addAttribute("message", "모델 객체를 통해서 객체가 전달");
		List<String> fruits = new ArrayList<>();
		fruits.add("사과");fruits.add("수박");fruits.add("참외");
		model.addAttribute("fruits", fruits);
		
		return "basic/basic3";
	}
}
