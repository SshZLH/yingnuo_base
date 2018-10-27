
package com.ynkd.base.controller.shiro.controller;

import com.alibaba.fastjson.JSONObject;
import com.ynkd.base.controller.shiro.service.LoginService;
import com.ynkd.base.controller.shiro.utils.CommonUtil;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import org.springframework.web.bind.annotation.PostMapping;


/**
 * @Description 登录相关Controller
 * @author Mind
 * @date 2018/8/10 9:56
 * @param
 * @return
 */
@RestController
@RequestMapping("/login")
public class LoginController {


    private static final org.slf4j.Logger log = LoggerFactory.getLogger(LoginController.class);
    @Autowired
    private LoginService loginService;


    /**
     * 登录
     *
     * @param requestJson
     * @return
     */

    @RequestMapping(value = "/auth" ,method = RequestMethod.POST)
    public JSONObject authLogin(@RequestBody JSONObject requestJson) {
        log.info("@@@@@@@@@@@@@@@@@@@@@@@@@");

        CommonUtil.hasAllRequired(requestJson, "username,password");
        return loginService.authLogin(requestJson);
    }


    /**
     * 查询当前登录用户的信息
     *
     * @return
     */

    @RequestMapping(value = "/getInfo" ,method = RequestMethod.POST)
    public JSONObject getInfo() {
     // response.setHeader("Access-Control-Allow-Origin", "*");
        log.info("****************");

        return loginService.getInfo();
    }


    /**
     * 登出
     *
     * @return
     */

    @RequestMapping(value = "/logout",method = RequestMethod.POST)
    public JSONObject logout() {
        return loginService.logout();
    }
}

