package cn.njnode.core.permission.dao;

import cn.njnode.beans.permission.UserRole;

public interface UserRoleDao {
    /**
     *
     * @param id
     */
    int deleteUserRoleById(Integer id);

    /**
     *
     * @param record
     */
    int add(UserRole record);

    /**
     *
     * @param record
     */
    int addUserRole(UserRole record);

    /**
     *
     * @param id
     */
    UserRole queryUserRoleById(Integer id);

    /**
     *
     * @param record
     */
    int updateUserRoleById(UserRole record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(UserRole record);
}