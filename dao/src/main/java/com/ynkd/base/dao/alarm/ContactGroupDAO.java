package com.ynkd.base.dao.alarm;

import com.ynkd.base.dao.base.MyBatisBaseDao;
import com.ynkd.base.model.alarm.ContactGroup;
import com.ynkd.base.model.alarm.ContactGroupExample;
import org.springframework.stereotype.Repository;

/**
 * ContactGroupDAO继承基类
 */
@Repository
public interface ContactGroupDAO extends MyBatisBaseDao<ContactGroup, String, ContactGroupExample> {
}