package cn.njnode.core.permission.dao;

import cn.njnode.beans.permission.User;

public interface UserDao {
    /**
     *
     * @param id
     */
    int deleteUserById(Long id);

    /**
     *
     * @param record
     */
    int add(User record);

    /**
     *
     * @param record
     */
    int addUser(User record);

    /**
     *
     * @param id
     */
    User queryUserById(Long id);

    /**
     *
     * @param record
     */
    int updateUserById(User record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(User record);
}