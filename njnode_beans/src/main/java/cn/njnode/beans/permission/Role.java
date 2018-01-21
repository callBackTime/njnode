package cn.njnode.beans.permission;

public class Role {
    /**
     * <pre>
     * 
     * 表字段 : sys_role.id
     * </pre>
     */
    private Long id;

    /**
     * <pre>
     * 
     * 表字段 : sys_role.role
     * </pre>
     */
    private String role;

    /**
     * <pre>
     * 描述
     * 表字段 : sys_role.des
     * </pre>
     */
    private String des;

    /**
     * <pre>
     * 
     * 表字段 : sys_role.resource_ids
     * </pre>
     */
    private String resourceIds;

    /**
     * <pre>
     * 
     * 表字段 : sys_role.available
     * </pre>
     */
    private Boolean available;

    /**
     * <pre>
     * 对应的用户名称
     * 表字段 : sys_role.user_names
     * </pre>
     */
    private String userNames;

    /**
     * <pre>
     * 获取：
     * 表字段：sys_role.id
     * </pre>
     *
     * @return sys_role.id：
     */
    public Long getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：sys_role.id
     * </pre>
     *
     * @param id
     *            sys_role.id：
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：sys_role.role
     * </pre>
     *
     * @return sys_role.role：
     */
    public String getRole() {
        return role;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：sys_role.role
     * </pre>
     *
     * @param role
     *            sys_role.role：
     */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    /**
     * <pre>
     * 获取：描述
     * 表字段：sys_role.des
     * </pre>
     *
     * @return sys_role.des：描述
     */
    public String getDes() {
        return des;
    }

    /**
     * <pre>
     * 设置：描述
     * 表字段：sys_role.des
     * </pre>
     *
     * @param des
     *            sys_role.des：描述
     */
    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    /**
     * <pre>
     * 获取：
     * 表字段：sys_role.resource_ids
     * </pre>
     *
     * @return sys_role.resource_ids：
     */
    public String getResourceIds() {
        return resourceIds;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：sys_role.resource_ids
     * </pre>
     *
     * @param resourceIds
     *            sys_role.resource_ids：
     */
    public void setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds == null ? null : resourceIds.trim();
    }

    /**
     * <pre>
     * 获取：
     * 表字段：sys_role.available
     * </pre>
     *
     * @return sys_role.available：
     */
    public Boolean getAvailable() {
        return available;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：sys_role.available
     * </pre>
     *
     * @param available
     *            sys_role.available：
     */
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    /**
     * <pre>
     * 获取：对应的用户名称
     * 表字段：sys_role.user_names
     * </pre>
     *
     * @return sys_role.user_names：对应的用户名称
     */
    public String getUserNames() {
        return userNames;
    }

    /**
     * <pre>
     * 设置：对应的用户名称
     * 表字段：sys_role.user_names
     * </pre>
     *
     * @param userNames
     *            sys_role.user_names：对应的用户名称
     */
    public void setUserNames(String userNames) {
        this.userNames = userNames == null ? null : userNames.trim();
    }
}