package cn.njnode.beans.permission;

public class Resource {
    /**
     * <pre>
     * 
     * 表字段 : sys_resource.id
     * </pre>
     */
    private Long id;

    /**
     * <pre>
     * 
     * 表字段 : sys_resource.name
     * </pre>
     */
    private String name;

    /**
     * <pre>
     * 
     * 表字段 : sys_resource.type
     * </pre>
     */
    private String type;

    /**
     * <pre>
     * 
     * 表字段 : sys_resource.url
     * </pre>
     */
    private String url;

    /**
     * <pre>
     * 
     * 表字段 : sys_resource.parent_id
     * </pre>
     */
    private Long parentId;

    /**
     * <pre>
     * 
     * 表字段 : sys_resource.parent_ids
     * </pre>
     */
    private String parentIds;

    /**
     * <pre>
     * 
     * 表字段 : sys_resource.permission
     * </pre>
     */
    private String permission;

    /**
     * <pre>
     * 
     * 表字段 : sys_resource.available
     * </pre>
     */
    private Boolean available;

    /**
     * <pre>
     * 
     * 表字段 : sys_resource.des
     * </pre>
     */
    private String des;

    /**
     * <pre>
     * 获取：
     * 表字段：sys_resource.id
     * </pre>
     *
     * @return sys_resource.id：
     */
    public Long getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：sys_resource.id
     * </pre>
     *
     * @param id
     *            sys_resource.id：
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：sys_resource.name
     * </pre>
     *
     * @return sys_resource.name：
     */
    public String getName() {
        return name;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：sys_resource.name
     * </pre>
     *
     * @param name
     *            sys_resource.name：
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * <pre>
     * 获取：
     * 表字段：sys_resource.type
     * </pre>
     *
     * @return sys_resource.type：
     */
    public String getType() {
        return type;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：sys_resource.type
     * </pre>
     *
     * @param type
     *            sys_resource.type：
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * <pre>
     * 获取：
     * 表字段：sys_resource.url
     * </pre>
     *
     * @return sys_resource.url：
     */
    public String getUrl() {
        return url;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：sys_resource.url
     * </pre>
     *
     * @param url
     *            sys_resource.url：
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * <pre>
     * 获取：
     * 表字段：sys_resource.parent_id
     * </pre>
     *
     * @return sys_resource.parent_id：
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：sys_resource.parent_id
     * </pre>
     *
     * @param parentId
     *            sys_resource.parent_id：
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：sys_resource.parent_ids
     * </pre>
     *
     * @return sys_resource.parent_ids：
     */
    public String getParentIds() {
        return parentIds;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：sys_resource.parent_ids
     * </pre>
     *
     * @param parentIds
     *            sys_resource.parent_ids：
     */
    public void setParentIds(String parentIds) {
        this.parentIds = parentIds == null ? null : parentIds.trim();
    }

    /**
     * <pre>
     * 获取：
     * 表字段：sys_resource.permission
     * </pre>
     *
     * @return sys_resource.permission：
     */
    public String getPermission() {
        return permission;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：sys_resource.permission
     * </pre>
     *
     * @param permission
     *            sys_resource.permission：
     */
    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    /**
     * <pre>
     * 获取：
     * 表字段：sys_resource.available
     * </pre>
     *
     * @return sys_resource.available：
     */
    public Boolean getAvailable() {
        return available;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：sys_resource.available
     * </pre>
     *
     * @param available
     *            sys_resource.available：
     */
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：sys_resource.des
     * </pre>
     *
     * @return sys_resource.des：
     */
    public String getDes() {
        return des;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：sys_resource.des
     * </pre>
     *
     * @param des
     *            sys_resource.des：
     */
    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }
}