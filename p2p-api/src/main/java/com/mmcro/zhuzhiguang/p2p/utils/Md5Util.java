package com.mmcro.zhuzhiguang.p2p.utils;

import org.springframework.util.DigestUtils;

/**
 * 
 * @ClassName: Md5Util 
 * @Description: 加密
 * @author:晋前 
 * @date: 2019年7月18日 下午8:06:12
 */
public class Md5Util {

	/**
	 * 直接对密码进行散列,那么黑客可以对通过获得这个密码散列值,
	 * 然后通过查散列值字典(例如MD5密码破解网站),得到某用户的密码
	 * 加salt可以在一定程度上解决这个问题
	 */
	//加盐值
	private static String salt = "1a2b3c4d";
	
	public static String md5Encoding(String password) {
		
		//return DigestUtils.md5Hex(password + salt);
		
		String s = password + salt;
		
		return new String(DigestUtils.md5Digest(s.getBytes()));
	
	}
}
