package com.example.spmydemo.controller;

import com.example.spmydemo.entity.UserInfo;
import com.hazelcast.util.MD5Util;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.security.provider.MD5;

/**
 * @ClassName UserInfoController
 * @Description TODO
 * @Author CaoJacks
 * @Date 2019/5/2 23:57
 * @Version 1.0
 */
@Controller
@RequestMapping("info")
public class UserInfoController {

    /**
     * 用户查询.
     * @return
     */
    @RequestMapping("/userList")
    @RequiresPermissions("userInfo:view")//权限管理;
    public String userInfo(){
        return "userInfo";
    }

    /**
     * 用户添加;
     * @return
     */
    @RequestMapping("/userAdd")
    @RequiresPermissions("userInfo:add")//权限管理;
    public String userInfoAdd(UserInfo user){
        UserInfo userInfo = new UserInfo();
        userInfo.setUid(2);
        userInfo.setName(user.getName());
        userInfo.setPassword(MD5Util.toMD5String(user.getPassword()));
        userInfo.setUsername(user.getUsername());
        userInfo.setState(user.getState());
        // userInfo.setSalt();

        return "userInfoAdd";
    }

    /**
     * 用户删除;
     * @return
     */
    @RequestMapping("/userDel")
    @RequiresPermissions("userInfo:del")//权限管理;
    public String userDel(){
        return "userInfoDel";
    }

}
