package com.ynkd.base.dao.log;

import com.ynkd.base.dao.base.MyBatisBaseDao;
import com.ynkd.base.model.log.SysOperationLog;
import com.ynkd.base.model.log.SysOperationLogContent;
import com.ynkd.base.model.log.SysOperationLogContentExample;
import com.ynkd.base.model.log.SysOperationLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SysOperationLogDAO extends MyBatisBaseDao<SysOperationLog, String, SysOperationLogExample> {

}