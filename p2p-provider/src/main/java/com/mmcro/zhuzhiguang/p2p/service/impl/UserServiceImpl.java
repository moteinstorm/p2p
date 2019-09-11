package com.mmcro.zhuzhiguang.p2p.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.mmcro.zhuzhiguang.p2p.dao.UserMapper;
import com.mmcro.zhuzhiguang.p2p.entity.User;
import com.mmcro.zhuzhiguang.p2p.service.UserService;
import com.mmcro.zhuzhiguang.p2p.utils.Md5Util;

@Service(interfaceClass=UserService.class)
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper userMapper;

	@Override
	public User register(User user) {
		
		// TODO Auto-generated method stub
		user.setPassword(Md5Util.md5Encoding(user.getPassword()));
		
		int result = userMapper.add(user);
		if(result>0)
			return user;
		else
			return null;
		
	}

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		user.setPassword(Md5Util.md5Encoding(user.getPassword()));
		User getUser = userMapper.findUser(user);
		return getUser;
	}

	@Override
	public User findByName(String name) {
		// TODO Auto-generated method stub
		User getUser = userMapper.findByName(name);
		return getUser;

	}

}
