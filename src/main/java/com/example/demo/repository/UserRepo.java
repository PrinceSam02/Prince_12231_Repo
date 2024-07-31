package com.example.demo.repository;

import com.example.demo.model.User;

public interface UserRepo {
    

	User findByUserName(String userName);

	User save(User user);

}


