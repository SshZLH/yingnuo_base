package com.ynkd.base.service.impl.shiro;

import com.alibaba.fastjson.JSONObject;
import com.ynkd.base.dao.user.UserDAO;
import com.ynkd.base.model.user.User;
import com.ynkd.base.service.shiro.BaseUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IDEA
 * author:Mind
 *
 * Date:2018/8/3
 * Time:15:41
 */
@Service("baseUserService")
public class BaseUserServiceImpl implements BaseUserService {



    @Resource
    private UserDAO userDAO;
    /**
     * 查询用户数量
     *
     * @param jsonObject
     * @return
     */
    @Override
    public int countUser(JSONObject jsonObject) {
        return userDAO.countUser(jsonObject);
    }

    /**
     * 查询用户列表
     *
     * @param jsonObject
     * @return
     */
    @Override
    public List<JSONObject> listUser(JSONObject jsonObject) {
       String userId= (String) jsonObject.get("userId");
        if (userId.equals("1")){
            return userDAO.listUserByAdmin(jsonObject);
        }
        return userDAO.listUser(jsonObject);
    }

    /**
     * 查询所有的角色
     * 在添加/修改用户的时候要使用此方法
     *
     * @return
     */
    @Override
    public List<JSONObject> getAllRoles(String userId) {
        if (userId.equals("1")){
            return userDAO.getAllRolesByAdmin();
        }
        return userDAO.getAllRoles();
    }

    /**
     * 校验用户名是否已存在
     *
     * @param jsonObject
     * @return
     */
    @Override
    public int queryExistUsername(JSONObject jsonObject) {
        return userDAO.queryExistUsername(jsonObject);
    }

    /**
     * 新增用户
     *
     * @param jsonObject
     * @return
     */
    @Override
    public int addUser(JSONObject jsonObject) {

        User user=new User();
        user.setUserId(jsonObject.getString("userId"));
        user.setUsername(jsonObject.getString("username"));
        user.setNickName(jsonObject.getString("nickname"));
        user.setPassword(jsonObject.getString("password"));
        user.setRoleId(Integer.valueOf(jsonObject.getString("roleId")));
        user.setProjectId(jsonObject.getString("projectId"));
        user.setStatus(1);//账号状态正常
        user.setTel(jsonObject.getString("userId"));
        user.setCreateAt(System.currentTimeMillis());
        user.setUpdateAt(System.currentTimeMillis());
        user.setIsDelete(1);//账号有效

        return userDAO.insert(user);
    }

    /**
     * 修改用户
     *
     * @param jsonObject
     * @return
     */
    @Override
    public int updateUser(JSONObject jsonObject) {
        jsonObject.put("updateAt",System.currentTimeMillis());
        return userDAO.updateUser(jsonObject);
    }

    /**
     * 角色列表
     *
     * @return
     */
    @Override
    public List<JSONObject> listRole(String userId) {
        if (userId.equals("1")){
            return userDAO.listRoleByAdmin();
        }
        return userDAO.listRole();
    }

    /**
     * 查询所有权限, 给角色分配权限时调用
     *
     * @return
     */
    @Override
    public List<JSONObject> listAllPermission(String userId) {
        if (userId.equals("1")){
           return userDAO.listAllPermissionByAdmin();
        }
        return userDAO.listAllPermission();
    }

    /**
     * 新增角色
     *
     * @param jsonObject
     * @return
     */
    @Override
    public String insertRole(JSONObject jsonObject) {
         userDAO.insertRole(jsonObject);
         return String.valueOf(jsonObject.get("roleId"));
    }

    /**
     * 批量插入角色的权限
     *
     * @param roleId      角色ID
     * @param permissions 权限
     * @return
     */
    @Override
    public int insertRolePermission(String roleId, List<Integer> permissions) {
        return userDAO.insertRolePermission(roleId,permissions);
    }

    /**
     * 将角色曾经拥有而修改为不再拥有的权限 delete_status改为'2'
     *
     * @param roleId
     * @param permissions
     * @return
     */
    @Override
    public int removeOldPermission(String roleId, List<Integer> permissions) {
        return userDAO.removeOldPermission(roleId,permissions);
    }

    /**
     * 修改角色名称
     *
     * @param jsonObject
     * @return
     */
    @Override
    public int updateRoleName(JSONObject jsonObject) {
        return userDAO.updateRoleName(jsonObject);
    }

    /**
     * 查询某角色的全部数据
     * 在删除和修改角色时调用
     *
     * @param jsonObject
     * @return
     */
    @Override
    public JSONObject getRoleAllInfo(JSONObject jsonObject) {
        return userDAO.getRoleAllInfo(jsonObject);
    }

    /**
     * 删除角色
     *
     * @param jsonObject
     * @return
     */
    @Override
    public int removeRole(JSONObject jsonObject) {
        return userDAO.removeRole(jsonObject);
    }

    /**
     * 删除本角色全部权限
     *
     * @param jsonObject
     * @return
     */
    @Override
    public int removeRoleAllPermission(JSONObject jsonObject) {
        return userDAO.removeRoleAllPermission(jsonObject);
    }

    /**
     * @param userName
     * @return com.wanhuchina.base.storage.model.user.UserInfoVo
     * @Description 查询用户的id和商户信息
     * @author Mind
     * @date 2018/8/23 22:18
     */

//    public UserInfoVo selectByUserName(String userName) {
//        return userDAO.selectByUserName(userName);
//    }
}
