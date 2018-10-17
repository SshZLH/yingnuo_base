package com.ynkd.base.dao.alarm;

import com.ynkd.base.dao.base.MyBatisBaseDao;
import com.ynkd.base.model.alarm.Alarm;
import com.ynkd.base.model.alarm.AlarmExample;
import org.springframework.stereotype.Repository;

/**
 * AlarmDAO继承基类
 */
@Repository
public interface AlarmDAO extends MyBatisBaseDao<Alarm, String, AlarmExample> {
}