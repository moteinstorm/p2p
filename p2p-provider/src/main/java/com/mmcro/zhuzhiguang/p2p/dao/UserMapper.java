package com.mmcro.zhuzhiguang.p2p.dao;

import org.apache.ibatis.annotations.Mapper;

import com.mmcro.zhuzhiguang.p2p.entity.User;

@Mapper
public interface UserMapper {
	
	int add(User user);
	User findByName(String name);
	int update(User user);
	// �����Ñ������ܴa����
	User findUser(User user); 
	
	
}
