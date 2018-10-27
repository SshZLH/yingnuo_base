package com.ynkd.base.service.impl.device;

import com.yingnuo.common.code.CommonCode;
import com.yingnuo.common.exception.CommonException;
import com.ynkd.base.dao.device.GatewayDAO;
import com.ynkd.base.model.device.Gateway;
import com.ynkd.base.model.device.GatewayExample;
import com.ynkd.base.service.device.DeviceService;
import com.ynkd.base.service.device.GatewayService;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IDEA
 * author: shen
 * p _ p
 * Date:2018/10/27
 * Time:15:41
 */
@Service("gatewayService")
public class GatewayServiceImpl implements GatewayService {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(DeviceService.class);

    @Resource
    private GatewayDAO gatewayDAO;

    /**
     * 通过主键查询
     * @param id
     * @return
     * @throws CommonException
     */
    @Override
    public Gateway selPk(String id) throws CommonException {
        LOGGER.info("进入GatewayServiceImpl，调用selPk，参数={}",id);
        try {
            return gatewayDAO.selectByPrimaryKey(id);
        } catch (Exception e) {
            LOGGER.debug("***----[error]，调用selPk，e={}",e);
            throw new CommonException(CommonCode.SQL_SELECT_ERROR.getCode(),CommonCode.SQL_SELECT_ERROR.getMsg());
        }
    }

    /**
     *通过其他条件查询
     * @param example
     * @return
     * @throws CommonException
     */
    @Override
    public List<Gateway> selModelsByE(GatewayExample example) throws CommonException {
        LOGGER.info("进入GatewayServiceImpl，调用selModelsByE，参数={}",example);
        try {
            return gatewayDAO.selectByExample(example);
        } catch (Exception e) {
            LOGGER.debug("***----[error]，调用selModelsByE，e={}",e);
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
    public int insModel(Gateway record) throws CommonException {
        LOGGER.info("进入GatewayServiceImpl，调用insModel，参数={}",record);
        try {
            return gatewayDAO.insertSelective(record);
        } catch (Exception e) {
            LOGGER.debug("***----[error]，调用insModel，e={}",e);
            throw new CommonException(CommonCode.SQL_UPD_ERROR.getCode(),CommonCode.SQL_UPD_ERROR.getMsg());
        }
    }

    /**
     * 通过主键修改
     * @param record
     * @return
     * @throws CommonException
     */
    @Override
    public int updModelByPk(Gateway record) throws CommonException {
        LOGGER.info("进入GatewayServiceImpl，调用updModelByPk，参数={}",record);
        try {
            return gatewayDAO.updateByPrimaryKeySelective(record);
        }catch (Exception e) {
            LOGGER.debug("***----[error]，调用updModelByPk，e={}",e);
            throw new CommonException(CommonCode.SQL_UPD_ERROR.getCode(),CommonCode.SQL_UPD_ERROR.getMsg());
        }
    }

    /**
     * 通过多条件修改
     * @param record
     * @param example
     * @return
     */
    @Override
    public int updModelByExample(Gateway record, GatewayExample example) {
        LOGGER.info("进入GatewayServiceImpl，调用updModelByExample，参数1={},参数2={}",record,example);
        try {
            return gatewayDAO.updateByExample(record,example);
        } catch (Exception e) {
            LOGGER.debug("***----[error]，调用updModelByExample，e={}",e);
            throw new CommonException(CommonCode.SQL_UPD_ERROR.getCode(),CommonCode.SQL_UPD_ERROR.getMsg());
        }
    }
}
