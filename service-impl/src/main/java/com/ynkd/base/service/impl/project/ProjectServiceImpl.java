package com.ynkd.base.service.impl.project;

import com.yingnuo.common.code.CommonCode;
import com.yingnuo.common.code.TxResultResponse;
import com.yingnuo.common.exception.CommonException;
import com.ynkd.base.dao.business.ProjectDAO;
import com.ynkd.base.dao.user.UserDAO;
import com.ynkd.base.model.business.Project;
import com.ynkd.base.model.user.User;
import com.ynkd.base.service.VO.ProjectVo;
import com.ynkd.base.service.impl.utils.AccountValidatorUtil;
import com.ynkd.base.service.project.ProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 * Created with IDEA
 * author:Mind
 *
 * Date:2018/10/30
 * Time:20:20
 */
public class ProjectServiceImpl implements ProjectService {
    private static final Logger log = LoggerFactory.getLogger(ProjectServiceImpl.class);

    @Resource
    private UserDAO userDAO;

    @Resource
    private ProjectDAO projectDAO;
    @Override
    public ProjectVo getProject(String userId) {
        TxResultResponse tx = new TxResultResponse(CommonCode.SUCCESS.getCode(), CommonCode.SUCCESS.getMsg());
        log.info("【projectService】**");
        try {
            User user = userDAO.selectByPrimaryKey(userId);

            if (AccountValidatorUtil.isNullOrEmpty(user)){
                log.error("【projectService】ID{}用户不存在或异常");
                throw new CommonException(CommonCode.ERROR.getCode(),CommonCode.PARAM_ERROR.getMsg());
            }
            Project project=projectDAO.selectByPrimaryKey(user.getProjectId());
        return null;
        }
        catch (CommonException e) {
            log.error("【projectService】CommonException e={}",e.getMsg());
            throw  new CommonException(e.getCode(), e.getMsg());
        } catch (Exception e) {
            e.printStackTrace();
            log.error("【projectService】Exception e={}",e.getMessage());
            throw new CommonException(CommonCode.SERVER_ERROR.getCode(), CommonCode.SERVER_ERROR.getMsg());
        }
    }

    @Override
    public TxResultResponse updateProject(ProjectVo projectVo) {
        TxResultResponse tx = new TxResultResponse(CommonCode.SUCCESS.getCode(), CommonCode.SUCCESS.getMsg());
        log.info("【projectService】**");
        try {
        return null;
        }
        catch (CommonException e) {
            log.error("【projectService】CommonException e={}",e.getMsg());
            throw  new CommonException(e.getCode(), e.getMsg());
        } catch (Exception e) {
            e.printStackTrace();
            log.error("【projectService】Exception e={}",e.getMessage());
            throw new CommonException(CommonCode.SERVER_ERROR.getCode(), CommonCode.SERVER_ERROR.getMsg());
        }
    }
}
