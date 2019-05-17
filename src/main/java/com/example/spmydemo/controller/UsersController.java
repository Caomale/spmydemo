package com.example.spmydemo.controller;

import com.example.spmydemo.entity.Users;
import com.example.spmydemo.service.UsersService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @ClassName UsersController
 * @Description TODO
 * @Author CaoJacks
 * @Date 2019/5/1 0:42
 * @Version 1.0
 */
@Controller
// @ComponentScan({"com.example.spmydemo.service"})
// @MapperScan("com.example.spmydemo.mapper")
@RequestMapping("/user")
public class UsersController {

    @Resource
    private UsersService usersService;

    @RequestMapping(value = "/find/{id}",method = RequestMethod.GET)
    public Users find(@RequestParam Integer userId) {
        return usersService.findById(userId);
    }

    @RequestMapping(value = "/findUserName/{username}",method = RequestMethod.GET)
    @ResponseBody
    public Users findByUserName(@RequestParam String userName) {
        return usersService.findByUserName(userName);
    }

    @RequestMapping(value = "")
    public String getIndex(Model model){
        Users user = usersService.findById(199);
        model.addAttribute("user", user);
        return "index";
    }
}
