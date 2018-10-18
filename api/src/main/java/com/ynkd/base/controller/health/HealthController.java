package com.ynkd.base.controller.health;

import com.ynkd.base.service.base.HealthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>Copyright© 2013-2017 AutoChina International Ltd. All rights reserved.</p>
 */
@RestController
@RequestMapping(value = "/base")
public class HealthController {

    private static final Logger logger= LoggerFactory.getLogger(HealthController.class);

    @Resource
    private HealthService healthService;


    @RequestMapping(value = "/health" , method = RequestMethod.GET)
    public String heath(){
        logger.info("--------health check-------");
        int i = healthService.testHealth();
        String result = "ok"+i;
        return result;
    }
}
