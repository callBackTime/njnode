package cn.njnode.core.permission.dao;

import cn.njnode.beans.permission.Role;

public interface RoleDao {
    /**
     *
     * @param id
     */
    int deleteRoleById(Long id);

    /**
     *
     * @param record
     */
    int add(Role record);

    /**
     *
     * @param record
     */
    int addRole(Role record);

    /**
     *
     * @param id
     */
    Role queryRoleById(Long id);

    /**
     *
     * @param record
     */
    int updateRoleById(Role record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(Role record);
}