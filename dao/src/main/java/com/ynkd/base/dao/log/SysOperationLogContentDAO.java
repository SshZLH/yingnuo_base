package com.ynkd.base.dao.log;

import com.ynkd.base.dao.base.MyBatisBaseDao;
import com.ynkd.base.model.log.SysOperationLogContent;
import com.ynkd.base.model.log.SysOperationLogContentExample;
import org.springframework.stereotype.Repository;

/**
 * SysOperationLogContentDAO继承基类
 */
@Repository
public interface SysOperationLogContentDAO extends MyBatisBaseDao<SysOperationLogContent, String, SysOperationLogContentExample> {
}