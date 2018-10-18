package com.ynkd.base.dao.business;

import com.ynkd.base.dao.base.MyBatisBaseDao;
import com.ynkd.base.model.business.Project;
import com.ynkd.base.model.business.ProjectExample;
import org.springframework.stereotype.Repository;

/**
 * ProjectDAO继承基类
 */
@Repository
public interface ProjectDAO extends MyBatisBaseDao<Project, Integer, ProjectExample> {
}