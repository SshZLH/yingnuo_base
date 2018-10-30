package com.ynkd.base.service.project;

import com.yingnuo.common.code.TxResultResponse;
import com.ynkd.base.service.VO.ProjectVo;

/**
 * Created with IDEA
 * author:Mind
 *
 * Date:2018/10/30
 * Time:20:19
 */
public interface ProjectService {


    /**
     * @Description 通过登陆用户获取当前用户的项目信息
     * @author Mind
     * @date 2018/10/30 20:28
     * @param [userId]
     * @return com.ynkd.base.service.VO.ProjectVo
     */
    ProjectVo getProject(String userId);


    /**
     * @Description 编辑当前项目
     * @author Mind
     * @date 2018/10/30 20:29
     * @param [projectVo]
     * @return com.yingnuo.common.code.TxResultResponse
     */
    TxResultResponse updateProject(ProjectVo projectVo);


}
