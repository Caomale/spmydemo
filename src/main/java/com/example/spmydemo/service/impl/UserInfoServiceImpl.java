package com.example.spmydemo.service.impl;

import com.example.spmydemo.entity.UserInfo;
import com.example.spmydemo.mapper.UserInfoMapper;
import com.example.spmydemo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserInfoServiceImpl
 * @Description TODO
 * @Author CaoJacks
 * @Date 2019/5/2 23:54
 * @Version 1.0
 */
@Service("UserInfoService")
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public UserInfo findByUsername(String username) {
        return userInfoMapper.findByUsername(username);
    }
}
