package com.ynkd.base.controller.shiro.impl;

import com.alibaba.fastjson.JSONObject;
import com.ynkd.base.controller.shiro.service.PermissionService;
import com.ynkd.base.service.shiro.BasePermissionService;
import com.ynkd.base.service.shiro.BaseUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

/**
 * @author: hxy
 * @description:
 * @date: 2017/10/30 13:15
 */
@Service
public class PermissionServiceImpl implements PermissionService {
    private Logger logger = LoggerFactory.getLogger(PermissionServiceImpl.class);

    @Resource
    private BaseUserService baseUserService;
    @Resource
    private BasePermissionService basePermissionService;

    /**
     * 查询某用户的 角色  菜单列表   权限列表
     *
     * @param username
     * @return
     */
    @Override
    public JSONObject getUserPermission(String username) {
        JSONObject userPermission = getUserPermissionFromDB(username);
        return userPermission;
    }

    /**
     * 从数据库查询用户权限信息
     *
     * @param username
     * @return
     */
    private JSONObject getUserPermissionFromDB(String username) {
        JSONObject userPermission = basePermissionService.getUserPermission(username);
        //管理员角色ID为1
        int adminRoleId = 1;
        //如果是管理员
        String roleIdKey = "roleId";
        if (adminRoleId == userPermission.getIntValue(roleIdKey)) {
            //查询所有菜单  所有权限
            Set<String> menuList = basePermissionService.getAllMenu();
            Set<String> permissionList = basePermissionService.getAllPermission();
            userPermission.put("menuList", menuList);
            userPermission.put("permissionList", permissionList);
        }
       // userPermission.put("userInfo",userInfo);
        return userPermission;
    }
}
