package com.example.food.Model;

public class CategoryModel {
    private Integer idCategory;
    private String image;
    private String categoryName;

    public CategoryModel(Integer idCategory, String image, String categoryName) {
        this.idCategory = idCategory;
        this.image = image;
        this.categoryName = categoryName;
    }

    public CategoryModel() {
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
