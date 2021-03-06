package com.jin.dao;

import com.jin.domain.UserActionLog;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jint on 2016/10/28.
 */
public interface ActionLogDao extends Dao<UserActionLog> {

    int add(UserActionLog userActionLog);

    UserActionLog findOneById(Serializable Id);

    /**
     * 分页查询
     *
     * @param offset 起始位置
     * @param limit  每页数量
     * @return
     */
    List<UserActionLog> findAll(@Param("offset") int offset, @Param("limit") int limit);


    int getAllCount();
}
