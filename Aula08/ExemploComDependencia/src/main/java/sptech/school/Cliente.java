package sptech.school;

import java.util.*;
import java.io.*;

//O cliente pode realizar vário pedidos
public class Cliente {
    private int id;
    private String nome;
    private List<Pedido> pedidos = new ArrayList();

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public void adicionaPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public List<Pedido> getPedidos() {
        return pedidos;
    }

}
