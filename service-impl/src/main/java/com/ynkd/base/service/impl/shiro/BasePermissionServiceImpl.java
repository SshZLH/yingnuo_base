package com.ynkd.base.service.impl.shiro;

import com.alibaba.fastjson.JSONObject;
import com.ynkd.base.dao.shiro.SysPermissionDAO;
import com.ynkd.base.service.shiro.BasePermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

/**
 * Created with IDEA
 * author:Mind
 *
 * Date:2018/8/3
 * Time:15:45
 */
@Service("basePermissionService")
public class BasePermissionServiceImpl implements BasePermissionService {


    @Resource
    private SysPermissionDAO sysPermissionDAO;
    /**
     * @param username
     * @return com.alibaba.fastjson.JSONObject
     * @Description 查询用户的角色 菜单 权限
     * @author Mind
     * @date 2018/8/3 16:27
     */
    @Override
    public JSONObject getUserPermission(String username) {
        return sysPermissionDAO.getUserPermission(username);
    }

    /**
     * @return java.util.Set<java.lang.String>
     * @Description 查询所有的菜单
     * @author Mind
     * @date 2018/8/3 16:28
     */
    @Override
    public Set<String> getAllMenu() {
        return sysPermissionDAO.getAllMenu();
    }

    /**
     * @return java.util.Set<java.lang.String>
     * @Description 查询所有的权限
     * @author Mind
     * @date 2018/8/3 16:29
     */
    @Override
    public Set<String> getAllPermission() {
        return sysPermissionDAO.getAllPermission();
    }
}
