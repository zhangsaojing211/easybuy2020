package com.buy.service.user;


import com.buy.entity.User;

import java.util.List;

public interface UserService {

	public boolean add(User user);

	public User getUser(String loginName);


}
