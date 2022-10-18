package com.spring_boot_login.backendproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	@RequestMapping("/")
	public String login() {
		return "loginForm";
	}
	
	@ResponseBody
	@RequestMapping("/loginForm")
	public String loginCheck(@RequestParam("id")String id,
							 @RequestParam("pwd")String pwd) {
		String result="";
		if(id.equals("abcd") && pwd.equals("1234"))
			result = "success";
		else
			result = "fail";
		return result;	
	
}
}
