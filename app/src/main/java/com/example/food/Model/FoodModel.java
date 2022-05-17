package com.example.food.Model;

public class FoodModel {
    private Integer id_food;
    private String food_name;
    private int price;
    private String Image;
    private String Description;

    public FoodModel(Integer id_food, String food_name, int price, String image, String description) {
        this.id_food = id_food;
        this.food_name = food_name;
        this.price = price;
        Image = image;
        Description = description;
    }

    public FoodModel() {
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public Integer getId_food() {
        return id_food;
    }

    public void setId_food(Integer id_food) {
        this.id_food = id_food;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
