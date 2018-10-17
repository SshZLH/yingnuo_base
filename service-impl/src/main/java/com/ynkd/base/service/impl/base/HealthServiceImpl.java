package com.ynkd.base.service.impl.base;

import com.yingnuo.util.CommonUtil;
import com.ynkd.base.dao.log.SysOperationLogDAO;
import com.ynkd.base.model.log.SysOperationLog;
import com.ynkd.base.service.base.HealthService;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IDEA
 * author: shen
 * p _ p
 * Date:2018/10/17
 * Time:12:36
 */
@Service("healthService")
public class HealthServiceImpl implements HealthService {

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(HealthServiceImpl.class);
    @Resource
    private SysOperationLogDAO sysOperationLogDAO;

    @Override
    public int testHealth() {
        LOG.info("--->in");
        SysOperationLog sysOperationLog = new SysOperationLog();
        sysOperationLog.setLogId(CommonUtil.getUUID());
        sysOperationLog.setLogTable("sysOperationLog");
        int insert = sysOperationLogDAO.insertSelective(sysOperationLog);
        return insert;
    }
}
