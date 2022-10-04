package com.service.impl;

import com.mapper.UserMapper;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//SpringBoot的事务管理是默认开启的
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    @Transactional
    public void insertTwo(String name1, String name2) {
        userMapper.insertUser(name1);
        //int i = 1 / 0;
        userMapper.insertUser(name2);
    }
}
