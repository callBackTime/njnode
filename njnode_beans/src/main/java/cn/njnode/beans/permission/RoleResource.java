package cn.njnode.beans.permission;

public class RoleResource {
    /**
     * <pre>
     * 
     * 表字段 : sys_role_resource.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 脚色id
     * 表字段 : sys_role_resource.role_id
     * </pre>
     */
    private Integer roleId;

    /**
     * <pre>
     * 资源id
     * 表字段 : sys_role_resource.resource_id
     * </pre>
     */
    private Integer resourceId;

    /**
     * <pre>
     * 获取：
     * 表字段：sys_role_resource.id
     * </pre>
     *
     * @return sys_role_resource.id：
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：sys_role_resource.id
     * </pre>
     *
     * @param id
     *            sys_role_resource.id：
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：脚色id
     * 表字段：sys_role_resource.role_id
     * </pre>
     *
     * @return sys_role_resource.role_id：脚色id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * <pre>
     * 设置：脚色id
     * 表字段：sys_role_resource.role_id
     * </pre>
     *
     * @param roleId
     *            sys_role_resource.role_id：脚色id
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * <pre>
     * 获取：资源id
     * 表字段：sys_role_resource.resource_id
     * </pre>
     *
     * @return sys_role_resource.resource_id：资源id
     */
    public Integer getResourceId() {
        return resourceId;
    }

    /**
     * <pre>
     * 设置：资源id
     * 表字段：sys_role_resource.resource_id
     * </pre>
     *
     * @param resourceId
     *            sys_role_resource.resource_id：资源id
     */
    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }
}