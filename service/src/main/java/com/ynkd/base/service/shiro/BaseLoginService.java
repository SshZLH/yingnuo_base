package com.ynkd.base.service.shiro;

import com.alibaba.fastjson.JSONObject;


/**
 * Created with IDEA
 * author:Mind
 *
 * Date:2018/8/3
 * Time:15:34
 */
public interface BaseLoginService {

    /**  
     * @Description  用来校验账号密码是否正确
     * @author Mind
     * @date 2018/8/3 16:16  
     * @param [username, password]  
     * @return com.alibaba.fastjson.JSONObject  
     */  
    JSONObject getUser(String username, String password);

    /**
     * @Description  登录成功获取该账号所属
     * @author Mind
     * @date 2018/8/7 16:50
     * @param [storeId]
     * @return com.wanhuchina.base.storage.model.store.Store
     */
  //  Store getStoreByStoreId(String storeId);

}
