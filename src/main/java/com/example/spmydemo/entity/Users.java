package com.example.spmydemo.entity;

import java.io.Serializable;

/**
 * @ClassName Users
 * @Description TODO
 * @Author CaoJacks
 * @Date 2019/5/1 0:00
 * @Version 1.0
 */
public class Users implements Serializable {

    private Integer id;
    private String userName;
    private Integer age;
    private String telPhone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTelPhone() {
        return telPhone;
    }

    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", telPhone='" + telPhone + '\'' +
                '}';
    }
}
