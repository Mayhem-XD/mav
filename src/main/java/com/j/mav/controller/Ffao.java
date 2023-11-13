package com.j.mav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/calc")
public class Ffao {
	@PostMapping("/calc")
	@ResponseBody	// 원래화면에 출력하기 위해
	public int calcRes(@RequestParam int num1,@RequestParam int num2,@RequestParam String calc) {
	    int result = 0;
	    switch (calc) {
	        case "+":
	            result = num1 + num2;
	            break;
	        case "-":
	            result = num1 - num2;
	            break;
	        case "*":
	            result = num1 * num2;
	            break;
	        case "/":
	            result = num1 / num2;
	            break;
	    }
	    return result;
	}
	

}
