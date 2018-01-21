package cn.njnode.beans.permission;

public class UserRole {
    /**
     * <pre>
     * 
     * 表字段 : sys_user_role.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 用户id
     * 表字段 : sys_user_role.user_id
     * </pre>
     */
    private Integer userId;

    /**
     * <pre>
     * 脚色id
     * 表字段 : sys_user_role.role_id
     * </pre>
     */
    private Integer roleId;

    /**
     * <pre>
     * 获取：
     * 表字段：sys_user_role.id
     * </pre>
     *
     * @return sys_user_role.id：
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：sys_user_role.id
     * </pre>
     *
     * @param id
     *            sys_user_role.id：
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：用户id
     * 表字段：sys_user_role.user_id
     * </pre>
     *
     * @return sys_user_role.user_id：用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * <pre>
     * 设置：用户id
     * 表字段：sys_user_role.user_id
     * </pre>
     *
     * @param userId
     *            sys_user_role.user_id：用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * <pre>
     * 获取：脚色id
     * 表字段：sys_user_role.role_id
     * </pre>
     *
     * @return sys_user_role.role_id：脚色id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * <pre>
     * 设置：脚色id
     * 表字段：sys_user_role.role_id
     * </pre>
     *
     * @param roleId
     *            sys_user_role.role_id：脚色id
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}