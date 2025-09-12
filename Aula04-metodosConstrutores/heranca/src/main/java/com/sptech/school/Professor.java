package com.sptech.school;

public class Professor extends Funcionario{
    public String getDisciplica() {
        return disciplica;
    }

    public void setDisciplica(String disciplica) {
        this.disciplica = disciplica;
    }

    private String disciplica;

    public Professor(){}
}


