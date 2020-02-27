package com.buy.service.user;


import com.buy.dao.user.IUser;
import com.buy.dao.user.UserDaoImpl;
import com.buy.entity.User;
import com.buy.utils.DataSourceUtil;

import java.sql.Connection;


public class UserServiceImpl implements UserService {


	@Override
	public boolean add(User user){
		Integer count=0;
		try {
			IUser userDao = new UserDaoImpl();
			count=userDao.add(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
			return  count>0;
		}


	@Override
	public User getUser(String loginName) {
		User user=null;
			IUser userDao = new UserDaoImpl();
			user=userDao.getUser(loginName);
			return user;

	}

}
