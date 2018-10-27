
package com.ynkd.base.controller.shiro.controller;

import com.alibaba.fastjson.JSONObject;

import com.ynkd.base.controller.shiro.service.UserService;
import com.ynkd.base.controller.shiro.utils.CommonUtil;
import com.ynkd.base.controller.shiro.utils.RandomUtil;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @Description 用户/角色/权限相关controller
 * @author Mind
 * @date 2018/8/10 9:57
 * @param
 * @return
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;


/**
     * 查询用户列表
     *
     * @param request
     * @return
     */

    @RequiresPermissions("user:list")
    @RequestMapping(value = "/list" ,method = RequestMethod.GET)
    public JSONObject listUser(HttpServletRequest request) {
        return userService.listUser(CommonUtil.request2Json(request));
    }

    @RequiresPermissions("user:add")
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public JSONObject addUser(@RequestBody JSONObject requestJson) {
        CommonUtil.hasAllRequired(requestJson, "username, password, nickname,   roleId");
        requestJson.put("userId", RandomUtil.genarateId("dayun"));
        return userService.addUser(requestJson);
    }

    @RequiresPermissions("user:update")
    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    public JSONObject updateUser(@RequestBody JSONObject requestJson) {
        CommonUtil.hasAllRequired(requestJson, " nickname, roleId, deleteStatus, userId");
        System.out.println(requestJson);
        return userService.updateUser(requestJson);
    }




    @RequiresPermissions(value = {"user:add", "user:update"}, logical = Logical.OR)
    @RequestMapping(value = "/getAllRoles",method = RequestMethod.GET)
    public JSONObject getAllRoles(String userId) {
        return userService.getAllRoles(userId);
    }


    /**
     * 角色列表
     *
     * @return
     */

    @RequiresPermissions("role:list")
    @RequestMapping(value = "/listRole",method = RequestMethod.GET)
    public JSONObject listRole(String userId) {
        return userService.listRole(userId);
    }


    /**
     * 查询所有权限, 给角色分配权限时调用
     *
     * @return
     */

    @RequiresPermissions("role:list")
    @RequestMapping(value = "/listAllPermission",method = RequestMethod.GET)
    public JSONObject listAllPermission(String userId) {
        return userService.listAllPermission(userId);
    }


    /**
     * 新增角色
     *
     * @return
     */

    @RequiresPermissions("role:add")
    @RequestMapping(value = "/addRole",method = RequestMethod.POST)
    public JSONObject addRole(@RequestBody JSONObject requestJson) {
        CommonUtil.hasAllRequired(requestJson, "roleName,permissions");
        return userService.addRole(requestJson);
    }

    /**
     * 修改角色
     *
     * @return
     */

    @RequiresPermissions("role:update")
    @RequestMapping(value = "/updateRole",method = RequestMethod.POST)
    public JSONObject updateRole(@RequestBody JSONObject requestJson) {
        CommonUtil.hasAllRequired(requestJson, "roleId,roleName,permissions");
        return userService.updateRole(requestJson);
    }


    /**
     * 删除角色
     *
     * @param requestJson
     * @return
     */

    @RequiresPermissions("role:delete")
    @RequestMapping(value = "/deleteRole",method = RequestMethod.POST)
    public JSONObject deleteRole(@RequestBody JSONObject requestJson) {
        CommonUtil.hasAllRequired(requestJson, "roleId");
        return userService.deleteRole(requestJson);
    }
}
