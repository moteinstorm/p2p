package com.mmcro.zhuzhiguang.p2p.service;

import com.mmcro.zhuzhiguang.p2p.entity.User;

public interface UserService {
	
	// ע��
	User register(User user);
	
	//��¼
	User login(User user);
	
	User findByName(String name);
	
	
	
	
	

}
