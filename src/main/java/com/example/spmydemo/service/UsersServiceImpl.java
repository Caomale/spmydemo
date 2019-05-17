package com.example.spmydemo.service;

import com.example.spmydemo.entity.Users;
import com.example.spmydemo.mapper.UsersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

/**
 * @ClassName UsersServiceImpl
 * @Description TODO
 * @Author CaoJacks
 * @Date 2019/5/1 0:37
 * @Version 1.0
 */
// @ComponentScan({"com.example.spmydemo.mapper"})
@Service("UsersService")
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDao usersDao;

    @Override
    public void insert(Users user) {
        Users users = new Users();
        users.setUserName(user.getUserName());
        users.setAge(user.getAge());
        users.setTelPhone(user.getTelPhone());
        usersDao.insertUser(users);

    }

    @Override
    public void update(Users user) {
        Users users = new Users();
        users.setUserName(user.getUserName());
        users.setAge(user.getAge());
        users.setTelPhone(user.getTelPhone());
        usersDao.updateUser(users);

    }

    @Override
    public Users findById(int id) {
        return usersDao.selectUserById(id);
    }

    @Override
    public void delete(int id) {
        usersDao.deleteById(id);
    }

    @Override
    public Users findByUserName(String userName) {
        return usersDao.selectUserByUserName(userName);
    }
}
