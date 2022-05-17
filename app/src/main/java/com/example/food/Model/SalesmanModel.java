package com.example.food.Model;

import java.io.Serializable;

public class SalesmanModel implements Serializable {
    private Integer id_salesman;
    private String username;
    private String password;
    private String image;
    private Integer phone;
    private String name;
    private String name_store;
    private String address;

    public SalesmanModel(Integer id_salesman, String username, String password, String image, Integer phone, String name, String name_store, String address) {
        this.id_salesman = id_salesman;
        this.username = username;
        this.password = password;
        this.image = image;
        this.phone = phone;
        this.name = name;
        this.name_store = name_store;
        this.address = address;
    }

    public SalesmanModel() {
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

    public Integer getId_salesman() {
        return id_salesman;
    }

    public void setId_salesman(Integer id_salesman) {
        this.id_salesman = id_salesman;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
