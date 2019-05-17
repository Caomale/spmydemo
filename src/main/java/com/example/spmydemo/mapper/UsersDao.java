package com.example.spmydemo.mapper;

import com.example.spmydemo.entity.Users;
import org.springframework.stereotype.Component;

@Component
public interface UsersDao {

    void insertUser(Users user);

    void deleteById(Integer userId);

    void updateUser(Users user);

    Users selectUserById(Integer userId);

    Users selectUserByUserName(String userName);
}
