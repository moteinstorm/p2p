package com.mmcro.zhuzhiguang.p2p.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mmcro.zhuzhiguang.p2p.entity.User;

@RequestMapping("user")
@Controller
public class UserController {
	
	@RequestMapping(value="register",method=RequestMethod.GET) 
	public String register() {
		return "user/register";
	}
	
	@RequestMapping(value="register",method=RequestMethod.POST) 
	public String register(HttpServletRequest request,@Validated User user,BindingResult result) {
		
		//
		if(user.getPassword().equals(user.getConfirmPwd())) {
			result.rejectValue("confirmPwd", "confirmPwd", "ÃÜÂë²»Ò»ÖÂ");
		}
		
		return "user/register1";
	}
	
	
	
}
