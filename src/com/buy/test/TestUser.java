package com.buy.test;

import com.buy.dao.user.IUser;
import com.buy.dao.user.UserDaoImpl;
import com.buy.entity.User;
import com.buy.service.user.UserService;
import com.buy.service.user.UserServiceImpl;

public class TestUser {
    public static void main(String[] args) {
        IUser user=new UserDaoImpl();
        User sss= new User("asds","张扫静","123456",1,"130406198302141869","email.com","18231623304");
                int id=user.add(sss);
        System.out.println(id);
    }
}
