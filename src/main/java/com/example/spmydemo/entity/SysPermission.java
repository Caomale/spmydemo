package com.example.spmydemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName SysPermission
 * @Description TODO
 * @Author CaoJacks
 * @Date 2019/5/2 23:43
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysPermission {
    Integer id;//主键.
    String name;//名称.
    String url;//资源路径.
    String permission; //权限字符串
}
