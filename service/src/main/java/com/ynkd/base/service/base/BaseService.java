package com.ynkd.base.service.base;

import com.yingnuo.common.exception.CommonException;
import com.ynkd.base.model.device.Device;
import com.ynkd.base.model.device.DeviceExample;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IDEA
 * author: shen
 * p _ p
 * Date:2018/10/27
 * Time:15:21
 *  Service公共基类
 *  功能 增删改查
 *  @param <Model> The Model Class 泛型
 *  @param <E> The Example Class 泛型
 */
public interface BaseService<Model, E> {
    /**
     * 通过id查询
     * @param id
     * @return
     * @throws CommonException
     */
    Model selPk (String id) throws CommonException;
    /**
     * 通过example查询
     * @param example
     * @return
     * @throws CommonException
     */
    List<Model> selModelsByE (E example) throws CommonException;
    /**
     * 新增
     * @param record
     * @return
     * @throws CommonException
     */
    int insModel(Model record) throws CommonException;

    /**
     * 通过主键去修改
     * @param record
     * @return
     * @throws CommonException
     */
    int updModelByPk(Model record) throws CommonException;

    /**
     * 通过其余条件去修改
     * @param record
     * @param example
     * @return
     */
    int updModelByExample(Model record,E example);
}
