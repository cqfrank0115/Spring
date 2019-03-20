package com.itheima.annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource(name="userDao");
	private UserDao uerDao;
	public void save() {
		this.uerDao.save();
		System.out.println("userservice...save...");
	}
}
