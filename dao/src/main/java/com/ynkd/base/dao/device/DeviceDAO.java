package com.ynkd.base.dao.device;

import com.ynkd.base.dao.base.MyBatisBaseDao;
import com.ynkd.base.model.device.Device;
import com.ynkd.base.model.device.DeviceExample;
import org.springframework.stereotype.Repository;

/**
 * DeviceDAO继承基类
 */
@Repository
public interface DeviceDAO extends MyBatisBaseDao<Device, String, DeviceExample> {
}