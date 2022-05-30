package com.example.food.API.ApiModel;

import com.example.food.Model.SalerModel;

import java.util.List;

public class ProgramModel {
    private Integer id_program;
    private String name;
    private String image;
    private List<SalerModel> listSaler;

    public ProgramModel(Integer id_program, String name, String image, List<SalerModel> listSaler) {
        this.id_program = id_program;
        this.name = name;
        this.image = image;
        this.listSaler = listSaler;
    }

    public ProgramModel() {
    }

    public Integer getId_program() {
        return id_program;
    }

    public void setId_program(Integer id_program) {
        this.id_program = id_program;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<SalerModel> getListSaler() {
        return listSaler;
    }

    public void setListSaler(List<SalerModel> listSaler) {
        this.listSaler = listSaler;
    }
}
