package com.example.food.Model;

import java.util.List;

public class ProgramTypeModel {
    private Integer id_program;
    private String program_name;
    private List<SalesmanModel> ListSales;

    public ProgramTypeModel(Integer id_program, String program_name, List<SalesmanModel> listSales) {
        this.id_program = id_program;
        this.program_name = program_name;
        ListSales = listSales;
    }

    public ProgramTypeModel() {
    }

    public Integer getId_program() {
        return id_program;
    }

    public void setId_program(Integer id_program) {
        this.id_program = id_program;
    }

    public String getProgram_name() {
        return program_name;
    }

    public void setProgram_name(String program_name) {
        this.program_name = program_name;
    }

    public List<SalesmanModel> getListSales() {
        return ListSales;
    }

    public void setListSales(List<SalesmanModel> listSales) {
        ListSales = listSales;
    }
}
