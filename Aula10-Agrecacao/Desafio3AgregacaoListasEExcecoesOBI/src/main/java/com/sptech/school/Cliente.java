package com.sptech.school;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return nome + " - CPF: " + cpf;
    }
}