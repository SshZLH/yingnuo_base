package com.ynkd.base.service.impl.device;

import com.yingnuo.common.code.CommonCode;
import com.yingnuo.common.exception.CommonException;
import com.ynkd.base.dao.device.DeviceDAO;
import com.ynkd.base.model.device.Device;
import com.ynkd.base.model.device.DeviceExample;
import com.ynkd.base.service.device.DeviceService;
import com.ynkd.base.service.impl.base.HealthServiceImpl;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 设备管理实现类
 * Created with IDEA
 * author: shen
 * p _ p
 * Date:2018/10/27
 * Time:14:50
 */
@Service("deviceService")
public class DeviceServiceImpl implements DeviceService {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(DeviceService.class);
    @Resource
    private DeviceDAO deviceDAO;

    /**
     * 查询id
     * @param id
     * @return
     * @throws CommonException
     */
    @Override
    public Device selPk(String id) throws CommonException {
        LOGGER.info("进入DeviceServiceImpl，调用selDeviceByPk，参数={}",id);
        try {
            return deviceDAO.selectByPrimaryKey(id);
        } catch (Exception e) {
            LOGGER.debug("error，调用selDeviceByPk，e={}",e);
            throw new CommonException(CommonCode.SQL_SELECT_ERROR.getCode(),CommonCode.SQL_SELECT_ERROR.getMsg());
        }
    }
    /**
     * 查询
     * @param example
     * @return
     * @throws CommonException
     */
    @Override
    public List<Device> selModelsByE(DeviceExample example) throws CommonException {
        LOGGER.info("进入DeviceServiceImpl，调用selModelsByE，参数={}",example);
        try {
            return deviceDAO.selectByExample(example);
        } catch (Exception e) {
            LOGGER.debug("error，调用selDevices，e={}",e);
            throw new CommonException(CommonCode.SQL_SELECT_ERROR.getCode(),CommonCode.SQL_SELECT_ERROR.getMsg());
        }
    }
    /**
     * 新增
     * @param record
     * @return
     * @throws CommonException
     */
    @Override
    public int insModel(Device record) throws CommonException {
        LOGGER.info("进入DeviceServiceImpl，调用insDevice，参数={}",record);
        try {
            return deviceDAO.insertSelective(record);
        } catch (Exception e) {
            LOGGER.debug("error，调用insDevice，e={}",e);
            throw new CommonException(CommonCode.SQL_UPD_ERROR.getCode(),"新增device异常，SQL异常");
        }
    }

    /**
     * 修改
     * @param record
     * @return
     * @throws CommonException
     */
    @Override
    public int updModelByPk(Device record) throws CommonException {
        LOGGER.info("进入DeviceServiceImpl，调用updDeviceByPk，参数={}",record);
        try {
            return deviceDAO.updateByPrimaryKeySelective(record);
        } catch (Exception e) {
            LOGGER.debug("error，调用updDeviceByPk，e={}",e);
            throw new CommonException(CommonCode.SQL_UPD_ERROR.getCode(),CommonCode.SQL_UPD_ERROR.getMsg());
        }
    }

    /**
     *  通过example修改
     * @param record
     * @param example
     * @return
     */
    @Override
    public int updModelByExample(Device record, DeviceExample example) {
        LOGGER.info("进入DeviceServiceImpl，调用updDevicesByExample，参数1={},参数2={}",record,example);
        try {
            return deviceDAO.updateByExampleSelective(record,example);
        } catch (Exception e) {
            LOGGER.debug("error，调用updDevicesByExample，e={}",e);
            throw new CommonException(CommonCode.SQL_UPD_ERROR.getCode(),CommonCode.SQL_UPD_ERROR.getMsg());
        }
    }
}
