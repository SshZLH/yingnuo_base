package com.ynkd.base.dao.business;

import com.ynkd.base.dao.base.MyBatisBaseDao;
import com.ynkd.base.model.business.Place;
import com.ynkd.base.model.business.PlaceExample;
import org.springframework.stereotype.Repository;

/**
 * PlaceDAO继承基类
 */
@Repository
public interface PlaceDAO extends MyBatisBaseDao<Place, String, PlaceExample> {
}