package com.sptech.school;

import java.util.ArrayList;
import java.util.List;

// Pedido faz agregação com ItensPedido
public class Pedido {
    private Cliente cliente;
    private List<ItemPedido> itens;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    //Adicionar itens ao pedido, validando se o produto existe

    public void adicionarItem(String nomeProduto, int quantidade, List<Produto> cardapio)
        throws ProdutoNaoEncontradoExcpetion,
            QuantidadeInvalidaExcepion{

        Produto produtoEncontrado = null;
        for (Produto p: cardapio) {
            if (p.getNome().equalsIgnoreCase(nomeProduto)) {
                produtoEncontrado = p;
                break;
            }
        }

        if (produtoEncontrado == null){
            throw new ProdutoNaoEncontradoExcpetion("Produto " + nomeProduto +
                    "Não encontrado");
        }

        ItemPedido item = new ItemPedido(produtoEncontrado,quantidade);
        itens.add(item);
        System.out.println("Item " + produtoEncontrado.getNome() + " adicionado com sucesso");
    }

    // Listar os itens do Pedido
    public void ListarItens() {
        System.out.println("Itens do pedido do cliente: " + cliente);
        for (ItemPedido item: itens) {
            System.out.println(" - " + item);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item: itens) {
            total += item.getValorTotal();
        }
        return total;
    }

}
