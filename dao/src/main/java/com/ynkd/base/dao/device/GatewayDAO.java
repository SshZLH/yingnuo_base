package com.ynkd.base.dao.device;

import com.ynkd.base.dao.base.MyBatisBaseDao;
import com.ynkd.base.model.device.Gateway;
import com.ynkd.base.model.device.GatewayExample;
import org.springframework.stereotype.Repository;

/**
 * GatewayDAO继承基类
 */
@Repository
public interface GatewayDAO extends MyBatisBaseDao<Gateway, String, GatewayExample> {
}