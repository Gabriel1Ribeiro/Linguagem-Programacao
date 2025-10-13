package com.sptech.school;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    private List<Tarefa> listarTarefa;

    public Principal() {
        this.listarTarefa = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa t) {
        this.listarTarefa.add(t);
    }

    public void listarTarefas() {
        for (Tarefa t: this.listarTarefa) {
        }
    }

}
