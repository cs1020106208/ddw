package com.baizhi.entity;
public class Category {
    private Integer categoryId;
    private Integer parentId;
    private String categoryName;
    private Integer count;
    private String categoryType;
    public Category() {
        super();
    }
    public Category(Integer categoryId,Integer parentId,String categoryName,Integer count,String categoryType) {
        super();
        this.categoryId = categoryId;
        this.parentId = parentId;
        this.categoryName = categoryName;
        this.count = count;
        this.categoryType = categoryType;
    }
    public Integer getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getParentId() {
        return this.parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getCategoryType() {
        return this.categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

}
