package com.buy.dao.user;


import com.buy.entity.User;



/***
 * UserDao 用户业务的dao层
 * 从父类继承下的被使用的方法
 * User getById(userId);
 * Integer userDao.getRowCount(params);
 * List<User> userDao.getRowList(params);
 */
public interface IUser {

	int add(User user);//新增用户信息

    User getUser(String loginName);
}
