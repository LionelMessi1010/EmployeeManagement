package com.godfrey.service.impl;

import com.godfrey.mapper.UserMapper;
import com.godfrey.pojo.User;
import com.godfrey.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description : UserServiceImpl
 *
 * @author godfrey
 * @since 2020-05-26
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectPasswordByName(String userName, String password) {
        return userMapper.selectPasswordByName(userName, password);
    }
}
