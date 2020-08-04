package com.ctgu.elmboot.service.impl;

import com.ctgu.elmboot.mapper.UserMapper;
import com.ctgu.elmboot.po.User;
import com.ctgu.elmboot.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> selectUserList() {
        return userMapper.selectUserList();
    }
}
