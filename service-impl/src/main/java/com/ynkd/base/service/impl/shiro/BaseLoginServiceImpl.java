package com.ynkd.base.service.impl.shiro;

import com.alibaba.fastjson.JSONObject;
import com.ynkd.base.dao.user.UserDAO;
import com.ynkd.base.service.shiro.BaseLoginService;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IDEA
 * author:Mind
 *
 * Date:2018/8/3
 * Time:15:37
 */
@Service("baseLoginService")
public class BaseLoginServiceImpl implements BaseLoginService {


    private static final org.slf4j.Logger log = LoggerFactory.getLogger(BaseLoginServiceImpl.class);
    @Resource
    private UserDAO userDAO;

    @Override
    public JSONObject getUser(String username, String password) {
        log.info("查找用户名{}是否存在，密码校验",username);
        return userDAO.getUser(username,password);
    }

//    @Override
//    public Store getStoreByStoreId(String storeId) {
//        return storeDAO.selectByPrimaryKey(storeId);
//    }


}
