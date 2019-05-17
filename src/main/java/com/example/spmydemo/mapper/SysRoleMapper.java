package com.example.spmydemo.mapper;

import com.example.spmydemo.entity.SysRole;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SysRoleMapper {

    //通过username查找用户角色信息
    List<SysRole> findRoleByUsername(@Param("username") String username);
}
