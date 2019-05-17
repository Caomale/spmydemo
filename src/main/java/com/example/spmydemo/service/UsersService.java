package com.example.spmydemo.service;

import com.example.spmydemo.entity.Users;

public interface UsersService {

    public void insert(Users user);
    public void update(Users user);

    public Users findById(int id);

    public void delete(int id);

    public Users findByUserName(String userName);
}
