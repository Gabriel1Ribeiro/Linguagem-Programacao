package com.sptech.school;

public class Tarefa {
    private String descricao;
    private int prioridade;

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Tarefa(String descricao, int prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
    }

    @Override
    public String toString(){
        return "A " + descricao+ " Tem prioridade: " + prioridade;
    }
}
