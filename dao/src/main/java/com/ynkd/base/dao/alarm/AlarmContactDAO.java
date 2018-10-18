package com.ynkd.base.dao.alarm;

import com.ynkd.base.dao.base.MyBatisBaseDao;
import com.ynkd.base.model.alarm.AlarmContact;
import com.ynkd.base.model.alarm.AlarmContactExample;
import org.springframework.stereotype.Repository;

/**
 * AlarmContactDAO继承基类
 */
@Repository
public interface AlarmContactDAO extends MyBatisBaseDao<AlarmContact, String, AlarmContactExample> {
}