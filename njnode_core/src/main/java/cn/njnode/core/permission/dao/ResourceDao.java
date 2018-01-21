package cn.njnode.core.permission.dao;

import cn.njnode.beans.permission.Resource;

public interface ResourceDao {
    /**
     *
     * @param id
     */
    int deleteResourceById(Long id);

    /**
     *
     * @param record
     */
    int add(Resource record);

    /**
     *
     * @param record
     */
    int addResource(Resource record);

    /**
     *
     * @param id
     */
    Resource queryResourceById(Long id);

    /**
     *
     * @param record
     */
    int updateResourceById(Resource record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(Resource record);
}