package com.mmcro.zhuzhiguang.p2p.service;

import com.mmcro.zhuzhiguang.p2p.entity.User;

public interface UserService {
	
	// ×¢²á
	User register(User user);
	
	//µÇÂ¼
	User login(User user);
	
	User findByName(String name);
	
	
	
	
	

}
