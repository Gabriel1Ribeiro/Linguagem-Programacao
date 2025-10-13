package com.sptech.school;

public class TestePedido {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(1324, "Computador", 12, 4000, 3500, true, false);
        Pedido pedido2 = new Pedido(5262, "Leque", 4, 30, 25, false, true);
        Pedido pedido3 = new Pedido(7154, "Arroz", 23, 40, 13, false, false);

        Loja loja = new Loja();

        loja.cancelarPedido(pedido1);
        loja.aplicarPromocao(pedido2);
        loja.aplicarDesconto(pedido2);
        loja.aplicarDesconto(pedido3);
        loja.finalizarPedido(pedido1);
        loja.finalizarPedido(pedido2);
        loja.finalizarPedido(pedido3);
        loja.exibirRelatorio(loja);

    }
}
