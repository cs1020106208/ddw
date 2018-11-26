package com.baizhi.entity;
public class Menu {
    private Integer id;
    private String menuname;
    private String resourceurl;
    private Integer parentId;
    private Integer lev;
    public Menu() {
        super();
    }
    public Menu(Integer id,String menuname,String resourceurl,Integer parentId,Integer lev) {
        super();
        this.id = id;
        this.menuname = menuname;
        this.resourceurl = resourceurl;
        this.parentId = parentId;
        this.lev = lev;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenuname() {
        return this.menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getResourceurl() {
        return this.resourceurl;
    }

    public void setResourceurl(String resourceurl) {
        this.resourceurl = resourceurl;
    }

    public Integer getParentId() {
        return this.parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getLev() {
        return this.lev;
    }

    public void setLev(Integer lev) {
        this.lev = lev;
    }

}
