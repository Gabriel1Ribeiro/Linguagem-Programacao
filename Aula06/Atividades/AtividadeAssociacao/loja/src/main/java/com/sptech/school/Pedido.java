package com.sptech.school;

public class Pedido {
    int codigo;
    String produto;
    int quantidade;
    double valorUnitario;
    double valorComDesconto;
    boolean itemPromocional;
    boolean cancelado;

    public Pedido(int codigo, String produto, int quantidade, double valorUnitario,
                  double valorComDesconto, boolean itemPromocional, boolean cancelado) {
        this.codigo = codigo;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.valorComDesconto = valorComDesconto;
        this.itemPromocional = itemPromocional;
        this.cancelado = cancelado;
    }

    public double calcularValorTotal(){
        return valorUnitario * quantidade;
    }
}
