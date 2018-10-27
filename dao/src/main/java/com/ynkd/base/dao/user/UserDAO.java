package com.ynkd.base.dao.user;

import com.alibaba.fastjson.JSONObject;
import com.ynkd.base.model.user.User;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);



    /*shiro model start Mind*/

    JSONObject getUser(@Param("username") String username, @Param("password") String password);

    int countUser(JSONObject jsonObject);

    List<JSONObject> listUser(JSONObject jsonObject);

    List<JSONObject> listUserByAdmin(JSONObject jsonObject);

    List<JSONObject> getAllRoles();

    List<JSONObject> getAllRolesByAdmin();

    int queryExistUsername(JSONObject jsonObject);

    int addUser(JSONObject jsonObject);

    int updateUser(JSONObject jsonObject);

    List<JSONObject> listRole();

    List<JSONObject> listRoleByAdmin();

    List<JSONObject> listAllPermission();

    List<JSONObject> listAllPermissionByAdmin();

    int insertRole(JSONObject jsonObject);

    int insertRolePermission(@Param("roleId") String roleId, @Param("permissions") List<Integer> permissions);

    int removeOldPermission(@Param("roleId") String roleId, @Param("permissions") List<Integer> permissions);

    int updateRoleName(JSONObject jsonObject);

    JSONObject getRoleAllInfo(JSONObject jsonObject);

    int removeRole(JSONObject jsonObject);

    int removeRoleAllPermission(JSONObject jsonObject);

    /*shiro model end Mind*/

}