package com.ynkd.base.service.impl.alarm;

import com.yingnuo.common.code.CommonCode;
import com.yingnuo.common.exception.CommonException;
import com.ynkd.base.dao.alarm.ContactGroupDAO;
import com.ynkd.base.model.alarm.ContactGroup;
import com.ynkd.base.model.alarm.ContactGroupExample;
import com.ynkd.base.service.alarm.ContactGroupService;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 紧急联系人组
 * 和紧急联系人为one to many
 * Created with IDEA
 * author: shen
 * p _ p
 * Date:2018/10/27
 * Time:16:15
 */
@Service("contactGroupService")
public class ContactGroupServiceImpl implements ContactGroupService {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(AlarmServiceImpl.class);
    @Resource
    private ContactGroupDAO contactGroupDAO;

    /**
     * 查询紧急联系人组 通过pk
     * @param id
     * @return
     * @throws CommonException
     */
    @Override
    public ContactGroup selPk(String id) throws CommonException {
        LOGGER.info("进入ContactGroupServiceImpl，调用selPk，参数={}",id);
        try {
            return contactGroupDAO.selectByPrimaryKey(id);
        }  catch (Exception e) {
            LOGGER.debug("***----[error]，调用selPk，e={}",e);
            throw new CommonException(CommonCode.SQL_SELECT_ERROR.getCode(),CommonCode.SQL_SELECT_ERROR.getMsg());
        }
    }

    /**
     * 查询紧急联系人组
     * TODO
     * @param example
     * @return
     * @throws CommonException
     */
    @Override
    public List<ContactGroup> selModelsByE(ContactGroupExample example) throws CommonException {
        LOGGER.info("进入ContactGroupServiceImpl，调用selModelsByE，参数={}",example);
        try {
            return contactGroupDAO.selectByExample(example);
        }  catch (Exception e) {
            LOGGER.debug("***----[error]，调用selModelsByE，e={}",e);
            throw new CommonException(CommonCode.SQL_SELECT_ERROR.getCode(),CommonCode.SQL_SELECT_ERROR.getMsg());
        }
    }

    /**
     * 新增紧急联系人
     * @param record
     * @return
     * @throws CommonException
     */
    @Override
    public int insModel(ContactGroup record) throws CommonException {
        LOGGER.info("进入ContactGroupServiceImpl，调用insModel，参数={}",record);
        try {
            return contactGroupDAO.insertSelective(record);
        }  catch (Exception e) {
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
    public int updModelByPk(ContactGroup record) throws CommonException {
        LOGGER.info("进入ContactGroupServiceImpl，调用updModelByPk，参数={}",record);
        try {
            return contactGroupDAO.updateByPrimaryKeySelective(record);
        } catch (Exception e) {
            LOGGER.debug("***----[error]，调用updModelByPk，e={}",e);
            throw new CommonException(CommonCode.SQL_UPD_ERROR.getCode(),CommonCode.SQL_UPD_ERROR.getMsg());
        }
    }

    /**
     * 修改紧急联系人
     * TODO
     * 其他参数
     * @param record
     * @param example
     * @return
     */
    @Override
    public int updModelByExample(ContactGroup record, ContactGroupExample example) {
        LOGGER.info("进入ContactGroupServiceImpl，调用updModelByExample，参数1={},参数2={}",record,example);
        try {
            return contactGroupDAO.updateByExampleSelective(record, example);
        } catch (Exception e) {
            LOGGER.debug("***----[error]，调用updModelByExample，e={}",e);
            throw new CommonException(CommonCode.SQL_UPD_ERROR.getCode(),CommonCode.SQL_UPD_ERROR.getMsg());
        }
    }
}
