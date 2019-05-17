package com.example.spmydemo.service;

import com.example.spmydemo.entity.UserInfo;

public interface UserInfoService {

    /**通过username查找用户信息;*/
    UserInfo findByUsername(String username);
}
