package com.sptech.school;

// ItemPedido Agrega Produto
public class ItemPedido {
    private int quantidade;
    private Produto produto;

    public ItemPedido(Produto produto, int quantidade)
            throws QuantidadeInvalidaExcepion {
        if (quantidade <= 0) {
            throw new QuantidadeInvalidaExcepion("Quantidade inválida para este item!");
        }
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double getValorTotal(){
        return produto.getPreco()*quantidade;
    }

    @Override
    public String toString() {
        return produto.getNome() + " - " + quantidade + " x " +getValorTotal();
    }
}
