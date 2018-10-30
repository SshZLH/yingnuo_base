package com.ynkd.base.dao.business;

import com.ynkd.base.dao.base.MyBatisBaseDao;
import com.ynkd.base.model.business.Area;
import com.ynkd.base.model.business.AreaExample;
import org.springframework.stereotype.Repository;

/**
 * AreaDAO继承基类
 */
@Repository
public interface AreaDAO extends MyBatisBaseDao<Area, String, AreaExample> {

}