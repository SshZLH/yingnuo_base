package com.ynkd.base.service.shiro;

import com.alibaba.fastjson.JSONObject;

import java.util.Set;

/**
 * Created with IDEA
 * author:Mind
 *
 * Date:2018/8/3
 * Time:15:45
 */
public interface BasePermissionService {
    /**
     * @Description 查询用户的角色 菜单 权限
     * @author Mind
     * @date 2018/8/3 16:27
     * @param [username]
     * @return com.alibaba.fastjson.JSONObject
     */
    JSONObject getUserPermission(String username);


    /**
     * @Description 查询所有的菜单
     * @author Mind
     * @date 2018/8/3 16:28
     * @param []
     * @return java.util.Set<java.lang.String>
     */
    Set<String> getAllMenu();

    /**
     * @Description  查询所有的权限
     * @author Mind
     * @date 2018/8/3 16:29
     * @param []
     * @return java.util.Set<java.lang.String>
     */
    Set<String> getAllPermission();

}
