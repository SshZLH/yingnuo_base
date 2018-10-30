package com.ynkd.base.controller.project;

import com.yingnuo.common.code.CommonCode;
import com.yingnuo.common.code.TxResultResponse;
import com.yingnuo.common.exception.CommonException;
import com.ynkd.base.service.VO.ProjectVo;
import com.ynkd.base.service.project.ProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created with IDEA
 * author:Mind
 *
 * Date:2018/10/30
 * Time:20:35
 */
@RestController
@RequestMapping("project")
public class ProjectController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProjectController.class);



    @Resource
    private ProjectService projectService;

    @RequestMapping("info")
    public TxResultResponse getProject(String userId){
        TxResultResponse tx = new TxResultResponse(CommonCode.SUCCESS.getCode(), CommonCode.SUCCESS.getMsg());
        LOGGER.info("【projectController】, 用户Id{}获取项目信息",userId);

        //todo 操作日志待添加
        try {
            return tx;
        } catch (CommonException e) {
            LOGGER.error("CommonException,e={}",e.getMsg());
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            LOGGER.error("Exception,e={}",e.getMessage());
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常!");
        }
    }


    @RequestMapping("update")
    public TxResultResponse upProject(ProjectVo projectVo){
        TxResultResponse tx = new TxResultResponse(CommonCode.SUCCESS.getCode(), CommonCode.SUCCESS.getMsg());
        LOGGER.info("【projectController】更新项目{}",projectVo);

        //todo 操作日志待添加
        try {
            return  projectService.updateProject(projectVo);
        } catch (CommonException e) {
            LOGGER.error("CommonException,e={}",e.getMsg());
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            LOGGER.error("Exception,e={}",e.getMessage());
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常!");
        }
    }




}
