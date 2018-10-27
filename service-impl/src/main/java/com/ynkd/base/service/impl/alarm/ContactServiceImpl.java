package com.ynkd.base.service.impl.alarm;

import com.yingnuo.common.code.CommonCode;
import com.yingnuo.common.exception.CommonException;
import com.ynkd.base.dao.alarm.AlarmContactDAO;
import com.ynkd.base.model.alarm.AlarmContact;
import com.ynkd.base.model.alarm.AlarmContactExample;
import com.ynkd.base.service.alarm.ContactService;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 紧急联系人信息
 * Created with IDEA
 * author: shen
 * p _ p
 * Date:2018/10/27
 * Time:16:14
 */
@Service("contactService")
public class ContactServiceImpl implements ContactService {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(ContactServiceImpl.class);
    @Resource
    private AlarmContactDAO contactDAO;

    /**
     * 查询紧急联系人
     * TODO
     * PK
     * @param id
     * @return
     * @throws CommonException
     */
    @Override
    public AlarmContact selPk(String id) throws CommonException {
        LOGGER.info("进入contactService，调用selPk，参数={}",id);
        try {
            return contactDAO.selectByPrimaryKey(id);
        } catch (Exception e) {
            LOGGER.debug("***----[error]，调用selPk，e={}",e);
            throw new CommonException(CommonCode.SQL_SELECT_ERROR.getCode(),CommonCode.SQL_SELECT_ERROR.getMsg());
        }
    }

    /**
     * 查询紧急联系人
     * TODO
     * 其他参数
     * @param example
     * @return
     * @throws CommonException
     */
    @Override
    public List<AlarmContact> selModelsByE(AlarmContactExample example) throws CommonException {
        LOGGER.info("进入contactService，调用selModelsByE，参数={}",example);
        try {
            return contactDAO.selectByExample(example);
        } catch (Exception e) {
            LOGGER.debug("***----[error]，调用selModelsByE，e={}",e);
            throw new CommonException(CommonCode.SQL_SELECT_ERROR.getCode(),CommonCode.SQL_SELECT_ERROR.getMsg());
        }
    }

    /**
     * 新增紧急联系人参数
     * @param record
     * @return
     * @throws CommonException
     */
    @Override
    public int insModel(AlarmContact record) throws CommonException {
        LOGGER.info("进入contactService，调用insModel，参数={}",record);
        try {
            return contactDAO.insertSelective(record);
        } catch (Exception e) {
            LOGGER.debug("***----[error]，调用insModel，e={}",e);
            throw new CommonException(CommonCode.SQL_UPD_ERROR.getCode(),CommonCode.SQL_UPD_ERROR.getMsg());
        }
    }

    /**
     * 修改紧急联系人
     * TODO
     * PK
     * @param record
     * @return
     * @throws CommonException
     */
    @Override
    public int updModelByPk(AlarmContact record) throws CommonException {
        LOGGER.info("进入contactService，调用updModelByPk，参数={}",record);
        try {
            return contactDAO.updateByPrimaryKeySelective(record);
        } catch (Exception e) {
            LOGGER.debug("***----[error]，调用updModelByPk，e={}",e);
            throw new CommonException(CommonCode.SQL_UPD_ERROR.getCode(),CommonCode.SQL_UPD_ERROR.getMsg());
        }
    }

    /**
     * 修改紧急联系人参数
     * TODO
     * 其余参数
     * @param record
     * @param example
     * @return
     */
    @Override
    public int updModelByExample(AlarmContact record, AlarmContactExample example) {
        LOGGER.info("进入contactService，调用updModelByExample，参数1={},参数2={}",record,example);
        try {
            return contactDAO.updateByExample(record, example);
        } catch (Exception e) {
            LOGGER.debug("***----[error]，调用updModelByExample，e={}",e);
            throw new CommonException(CommonCode.SQL_UPD_ERROR.getCode(),CommonCode.SQL_UPD_ERROR.getMsg());
        }
    }
}
