package com.ynkd.base.service.impl.alarm;

import com.yingnuo.common.code.CommonCode;
import com.yingnuo.common.exception.CommonException;
import com.ynkd.base.dao.alarm.AlarmDAO;
import com.ynkd.base.model.alarm.Alarm;
import com.ynkd.base.model.alarm.AlarmExample;
import com.ynkd.base.service.alarm.AlarmService;
import com.ynkd.base.service.device.DeviceService;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 警报表，设备出现问题进行报警的列表
 * Created with IDEA
 * author: shen
 * p _ p
 * Date:2018/10/27
 * Time:16:13
 */
@Service("alarmService")
public class AlarmServiceImpl implements AlarmService {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(AlarmServiceImpl.class);
    @Resource
    private AlarmDAO alarmDAO;

    /**
     * 查询警报
     * TODO
     * PK
     * @param id
     * @return
     * @throws CommonException
     */
    @Override
    public Alarm selPk(String id) throws CommonException {
        LOGGER.info("进入AlarmServiceImpl，调用selPk，参数={}",id);
        try {
            return alarmDAO.selectByPrimaryKey(id);
        } catch (Exception e) {
            LOGGER.debug("***----[error]，调用selPk，e={}",e);
            throw new CommonException(CommonCode.SQL_SELECT_ERROR.getCode(),CommonCode.SQL_SELECT_ERROR.getMsg());
        }
    }

    /**
     * 查询警报
     * // TODO: 2018/10/27  恩
     * 其余参数
     * @param example
     * @return
     * @throws CommonException
     */
    @Override
    public List<Alarm> selModelsByE(AlarmExample example) throws CommonException {
        LOGGER.info("进入AlarmServiceImpl，调用selModelsByE，参数={}",example);
        try {
            return alarmDAO.selectByExample(example);
        } catch (Exception e) {
            LOGGER.debug("***----[error]，调用selModelsByE，e={}",e);
            throw new CommonException(CommonCode.SQL_SELECT_ERROR.getCode(),CommonCode.SQL_SELECT_ERROR.getMsg());
        }
    }

    /**
     * 新增警报
     * @param record
     * @return
     * @throws CommonException
     */
    @Override
    public int insModel(Alarm record) throws CommonException {
        LOGGER.info("进入AlarmServiceImpl，调用insModel，参数={}",record);
        try {
            return alarmDAO.insertSelective(record);
        } catch (Exception e) {
            LOGGER.debug("***----[error]，调用insModel，e={}",e);
            throw new CommonException(CommonCode.SQL_SELECT_ERROR.getCode(),CommonCode.SQL_SELECT_ERROR.getMsg());
        }
    }

    /**
     * 修改警报 一般用于消警
     * // TODO: 2018/10/27  PK
     * @param record
     * @return
     * @throws CommonException
     */
    @Override
    public int updModelByPk(Alarm record) throws CommonException {
        LOGGER.info("进入AlarmServiceImpl，调用updModelByPk，参数={}",record);
        try {
            return alarmDAO.updateByPrimaryKey(record);
        } catch (Exception e) {
            LOGGER.debug("***----[error]，调用updModelByPk，e={}",e);
            throw new CommonException(CommonCode.SQL_SELECT_ERROR.getCode(),CommonCode.SQL_SELECT_ERROR.getMsg());
        }
    }

    /**
     * 修改警报
     * // TODO: 2018/10/27
     * @param record
     * @param example
     * @return
     */
    @Override
    public int updModelByExample(Alarm record, AlarmExample example) {
        LOGGER.info("进入AlarmServiceImpl，调用updModelByExample，参数1={},参数2={}",record,example);
        try {
            return alarmDAO.updateByExampleSelective(record,example);
        } catch (Exception e) {
            LOGGER.debug("***----[error]，调用updModelByExample，e={}",e);
            throw new CommonException(CommonCode.SQL_UPD_ERROR.getCode(),CommonCode.SQL_UPD_ERROR.getMsg());
        }
    }
}
