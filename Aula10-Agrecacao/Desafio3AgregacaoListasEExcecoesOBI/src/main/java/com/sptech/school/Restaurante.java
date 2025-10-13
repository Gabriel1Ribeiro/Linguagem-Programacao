package com.sptech.school;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    public static void main(String[] args) {
        // Criar um cardápio
        List<Produto> cardapio = new ArrayList<>();
        cardapio.add(new Produto("Lasanha", 30.0, "Prato Principal"));
        cardapio.add(new Produto("Suco de laranja", 8.0, "Bebidas"));
        cardapio.add(new Produto("Salada", 15.0, "Entrada"));

        // Criar um cliente e o pedido do cliente
        Cliente cliente = new Cliente("João Silva", "123.456.789-00");
        Pedido pedido = new Pedido(cliente);

        try {
            pedido.adicionarItem("Lasanha", 2, cardapio);
            pedido.adicionarItem("Suco de Laranja", -1, cardapio);

        }catch (ProdutoNaoEncontradoExcpetion | QuantidadeInvalidaExcepion e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            pedido.adicionarItem("Pizza", 2, cardapio);
        }catch (ProdutoNaoEncontradoExcpetion | QuantidadeInvalidaExcepion e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Exibir os itens e o Total
        pedido.ListarItens();
        System.out.println("Valor do Pedido: " + pedido);
    }
}
