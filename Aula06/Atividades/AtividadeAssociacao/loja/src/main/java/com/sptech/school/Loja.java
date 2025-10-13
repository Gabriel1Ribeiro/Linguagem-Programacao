package com.sptech.school;

public class Loja {
    int pedidosRealizados, descontosAplicados, pedidosCancelados;

    public void aplicarPromocao(Pedido pedido) {
        pedido.itemPromocional = true;
        System.out.println("O produto " + pedido.produto + " está em promoção");
    }

    public void cancelarPedido(Pedido pedido) {
        pedido.cancelado = true;
        System.out.println("O pedido de código " + pedido.codigo + " foi cancelado.");
    }

    public void aplicarDesconto(Pedido pedido) {
        if (pedido.itemPromocional) {
            double valorTotal = pedido.valorUnitario * pedido.quantidade;
            double desconto = valorTotal - pedido.valorComDesconto;
            double porcentagem = (desconto / valorTotal) * 100.0;

            descontosAplicados++;
            System.out.println("Foi aplicado " + porcentagem + "% de desconto ao pedido de código " + pedido.codigo + ".");
        } else {
            System.out.println("Pedido não elegível para desconto, operação não finalizada.");
        }
    }

    public void finalizarPedido(Pedido pedido) {

        if (pedido.cancelado) {
            System.out.println("Pedido cancelado. Operação não realizada.");
            pedidosCancelados++;
            return;
        }

        double valorTotal = pedido.valorUnitario * pedido.quantidade;
        double desconto = valorTotal - pedido.valorComDesconto;

        boolean ItemPromocional = pedido.itemPromocional;
        String resultadoItem;

        double totalASerPago;

        if(ItemPromocional == true) {
            resultadoItem = "SIM";
            totalASerPago = valorTotal - desconto;
        }else{
            resultadoItem = "NÃO";
            totalASerPago = valorTotal;
        }

        System.out.println("\n-------------------- PEDIDO --------------------");
        System.out.println("Código: " + pedido.codigo);
        System.out.println("Item: " + pedido.produto);
        System.out.println("Valor unitário: " + pedido.valorUnitario);
        System.out.println("Quantidade: " + pedido.quantidade);
        System.out.println("Valor total: " + valorTotal);

        System.out.println("\nItem promocional: " + resultadoItem);
        System.out.println("Valor com desconto: " + pedido.valorComDesconto);

        System.out.println("Total a ser pago: " + totalASerPago);

        pedidosRealizados++;
    }

    public void exibirRelatorio(Loja loja) {
        System.out.println("\n-------------------- RELATÓRIO --------------------");
        System.out.println("Pedidos realizados: " + pedidosRealizados);
        System.out.println("Descontos aplicados: " + descontosAplicados);
        System.out.println("Pedidos cancelados: " + pedidosCancelados);

    }


}
