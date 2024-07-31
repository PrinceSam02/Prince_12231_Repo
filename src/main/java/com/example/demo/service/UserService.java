package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {
	User findByUserName(String userName);
	User saveUser(User user);
	
}

