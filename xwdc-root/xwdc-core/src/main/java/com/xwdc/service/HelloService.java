package com.xwdc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import com.xwdc.dao.UserInfoMapper;
import com.xwdc.domain.UserInfo;

@Service
@Transactional
public class HelloService {
	
	@Autowired
	private UserInfoMapper userInfoMapper;

	public String hello(UserInfo user) {
		return userInfoMapper.getUserInfo(user.getId()).getUserName();
	}
	
	public String insert(UserInfo user){
		userInfoMapper.insertUserInfo(user);
		return null;
	}
	
	@Transactional
	public String batch(){
		UserInfo user1 = new UserInfo("3","ma","13","fds");
		UserInfo user2 = new UserInfo("4","niu","14","fdsf");

		userInfoMapper.insertUserInfo(user1);
	//	int i=1/0;
		userInfoMapper.insertUserInfo(user2);

		return null;
	}


}
