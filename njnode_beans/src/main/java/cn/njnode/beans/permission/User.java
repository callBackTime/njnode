package cn.njnode.beans.permission;

public class User {
    /**
     * <pre>
     * 
     * 表字段 : sys_user.id
     * </pre>
     */
    private Long id;

    /**
     * <pre>
     * 
     * 表字段 : sys_user.organization_id
     * </pre>
     */
    private Long organizationId;

    /**
     * <pre>
     * 
     * 表字段 : sys_user.username
     * </pre>
     */
    private String username;

    /**
     * <pre>
     * 
     * 表字段 : sys_user.password
     * </pre>
     */
    private String password;

    /**
     * <pre>
     * 
     * 表字段 : sys_user.salt
     * </pre>
     */
    private String salt;

    /**
     * <pre>
     * 逗号分开
     * 表字段 : sys_user.role_names
     * </pre>
     */
    private String roleNames;

    /**
     * <pre>
     * 
     * 表字段 : sys_user.locked
     * </pre>
     */
    private Boolean locked;

    /**
     * <pre>
     * 描述
     * 表字段 : sys_user.des
     * </pre>
     */
    private String des;

    /**
     * <pre>
     * 父ID
     * 表字段 : sys_user.pid
     * </pre>
     */
    private Integer pid;

    /**
     * <pre>
     * 获取：
     * 表字段：sys_user.id
     * </pre>
     *
     * @return sys_user.id：
     */
    public Long getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：sys_user.id
     * </pre>
     *
     * @param id
     *            sys_user.id：
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：sys_user.organization_id
     * </pre>
     *
     * @return sys_user.organization_id：
     */
    public Long getOrganizationId() {
        return organizationId;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：sys_user.organization_id
     * </pre>
     *
     * @param organizationId
     *            sys_user.organization_id：
     */
    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：sys_user.username
     * </pre>
     *
     * @return sys_user.username：
     */
    public String getUsername() {
        return username;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：sys_user.username
     * </pre>
     *
     * @param username
     *            sys_user.username：
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * <pre>
     * 获取：
     * 表字段：sys_user.password
     * </pre>
     *
     * @return sys_user.password：
     */
    public String getPassword() {
        return password;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：sys_user.password
     * </pre>
     *
     * @param password
     *            sys_user.password：
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * <pre>
     * 获取：
     * 表字段：sys_user.salt
     * </pre>
     *
     * @return sys_user.salt：
     */
    public String getSalt() {
        return salt;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：sys_user.salt
     * </pre>
     *
     * @param salt
     *            sys_user.salt：
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * <pre>
     * 获取：逗号分开
     * 表字段：sys_user.role_names
     * </pre>
     *
     * @return sys_user.role_names：逗号分开
     */
    public String getRoleNames() {
        return roleNames;
    }

    /**
     * <pre>
     * 设置：逗号分开
     * 表字段：sys_user.role_names
     * </pre>
     *
     * @param roleNames
     *            sys_user.role_names：逗号分开
     */
    public void setRoleNames(String roleNames) {
        this.roleNames = roleNames == null ? null : roleNames.trim();
    }

    /**
     * <pre>
     * 获取：
     * 表字段：sys_user.locked
     * </pre>
     *
     * @return sys_user.locked：
     */
    public Boolean getLocked() {
        return locked;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：sys_user.locked
     * </pre>
     *
     * @param locked
     *            sys_user.locked：
     */
    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    /**
     * <pre>
     * 获取：描述
     * 表字段：sys_user.des
     * </pre>
     *
     * @return sys_user.des：描述
     */
    public String getDes() {
        return des;
    }

    /**
     * <pre>
     * 设置：描述
     * 表字段：sys_user.des
     * </pre>
     *
     * @param des
     *            sys_user.des：描述
     */
    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    /**
     * <pre>
     * 获取：父ID
     * 表字段：sys_user.pid
     * </pre>
     *
     * @return sys_user.pid：父ID
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * <pre>
     * 设置：父ID
     * 表字段：sys_user.pid
     * </pre>
     *
     * @param pid
     *            sys_user.pid：父ID
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }
}