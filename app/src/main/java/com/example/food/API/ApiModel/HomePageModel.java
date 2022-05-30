package com.example.food.API.ApiModel;

import com.example.food.Model.CategoryModel;

import java.util.List;

public class HomePageModel {
    private boolean Status;
    private List<CategoryModel> listCategory;
    private List<ProgramModel> listProgram;

    public HomePageModel(boolean status, List<CategoryModel> listCategory, List<ProgramModel> listProgram) {
        Status = status;
        this.listCategory = listCategory;
        this.listProgram = listProgram;
    }

    public HomePageModel() {
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    public List<CategoryModel> getListCategory() {
        return listCategory;
    }

    public void setListCategory(List<CategoryModel> listCategory) {
        this.listCategory = listCategory;
    }

    public List<ProgramModel> getListProgram() {
        return listProgram;
    }

    public void setListProgram(List<ProgramModel> listProgram) {
        this.listProgram = listProgram;
    }
}
