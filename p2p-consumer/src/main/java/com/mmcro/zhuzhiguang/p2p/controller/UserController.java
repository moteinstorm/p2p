package com.mmcro.zhuzhiguang.p2p.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mmcro.zhuzhiguang.p2p.comon.ConstKey;
import com.mmcro.zhuzhiguang.p2p.entity.User;
import com.mmcro.zhuzhiguang.p2p.service.UserService;

@RequestMapping("user")
@Controller
public class UserController {
	
	@Reference
	UserService userSerive;
	
	
	@RequestMapping(value="login",method=RequestMethod.GET) 
	public String login() {
		return "user/login";
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST) 
	public String login(HttpServletRequest request,@Validated User user,BindingResult result)
    {
		User loginUser = userSerive.login(user);
		if(loginUser!=null) {
			request.getSession().setAttribute(ConstKey.USER_SEESION_KEY, loginUser);
			return "user/logineee";
		}else {
			return "user/login";
		}
	}
	
	
	@RequestMapping(value="register",method=RequestMethod.GET) 
	public String register() {
		return "user/register";
	}
	
	@RequestMapping(value="register",method=RequestMethod.POST) 
	public String register(HttpServletRequest request,@Validated User user,BindingResult result) {
		
		
		//
		/*if(user.getPassword().equals(user.getConfirmPwd())) {
			result.rejectValue("confirmPwd", "confirmPwd", "ÃÜÂë²»Ò»ÖÂ");
		}*/
		user.setRegisterIp(request.getRemoteAddr());
		user.setRegisterDate(new Date());
		
		userSerive.register(user);
		return "user/register1";
	}
	
	
	
}
