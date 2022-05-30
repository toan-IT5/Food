package com.example.food.Model;

import java.io.Serializable;

public class SalerModel implements Serializable {
    private Integer id_saler;
    private String username;
    private String password;
    private String image;
    private Integer phone;
    private String name_store;
    private String address;

    public SalerModel(Integer id_saler, String username, String password, String image, Integer phone, String name_store, String address) {
        this.id_saler = id_saler;
        this.username = username;
        this.password = password;
        this.image = image;
        this.phone = phone;
        this.name_store = name_store;
        this.address = address;
    }

    public SalerModel() {
    }

    public Integer getId_saler() {
        return id_saler;
    }

    public void setId_saler(Integer id_saler) {
        this.id_saler = id_saler;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getName_store() {
        return name_store;
    }

    public void setName_store(String name_store) {
        this.name_store = name_store;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
