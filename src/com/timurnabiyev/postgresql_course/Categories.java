package com.timurnabiyev.postgresql_course;

public class Categories {
    private Integer categoryId;
    private String categoryName;
    private String description;
    private String picture;

    public Categories() {
    }

    public Categories(Integer categoryId, String categoryName, String description, String picture) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.description = description;
        this.picture = picture;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
