package com.example.spmydemo.mapper;

import com.example.spmydemo.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @ClassName UserInfoMapper
 * @Description TODO
 * @Author CaoJacks
 * @Date 2019/5/2 23:45
 * @Version 1.0
 */
@Component
public interface UserInfoMapper {
    //通过username查找用户信息
    UserInfo findByUsername(@Param("username") String username);
}
