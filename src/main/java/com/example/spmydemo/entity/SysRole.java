package com.example.spmydemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName SysRole
 * @Description TODO
 * @Author CaoJacks
 * @Date 2019/5/2 23:39
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysRole {
    Integer id;
    String role;//角色标识程序中判断使用,如"admin",这个是唯一的:
    String description; // 角色描述,UI界面显示使用
    private Boolean available = Boolean.FALSE; // 是否可用,如果不可用将不会添加给用户
}
