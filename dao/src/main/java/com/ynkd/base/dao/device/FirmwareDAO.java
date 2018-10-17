package com.ynkd.base.dao.device;

import com.ynkd.base.dao.base.MyBatisBaseDao;
import com.ynkd.base.model.device.Firmware;
import com.ynkd.base.model.device.FirmwareExample;
import org.springframework.stereotype.Repository;

/**
 * FirmwareDAO继承基类
 */
@Repository
public interface FirmwareDAO extends MyBatisBaseDao<Firmware, Integer, FirmwareExample> {
}