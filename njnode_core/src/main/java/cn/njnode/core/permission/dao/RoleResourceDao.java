package cn.njnode.core.permission.dao;

import cn.njnode.beans.permission.RoleResource;

public interface RoleResourceDao {
    /**
     *
     * @param id
     */
    int deleteRoleResourceById(Integer id);

    /**
     *
     * @param record
     */
    int add(RoleResource record);

    /**
     *
     * @param record
     */
    int addRoleResource(RoleResource record);

    /**
     *
     * @param id
     */
    RoleResource queryRoleResourceById(Integer id);

    /**
     *
     * @param record
     */
    int updateRoleResourceById(RoleResource record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(RoleResource record);
}