package sptech.school;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        String caminhoArquivo = "clientes_pedidos.csv";

        Cliente c1 = new Cliente(1,"Maria");
        c1.adicionaPedido(new Pedido(101,"Notebook",3500.00));
        c1.adicionaPedido(new Pedido(102,"Mouse",35.00));

        Cliente c2 = new Cliente(2,"João");
        c2.adicionaPedido(new Pedido(103,"Smartphone",13500.00));
        List<Cliente> clientes = Arrays.asList(c1,c2);

        //Escrever no CSV
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo));
            CSVPrinter csvPrinter = new CSVPrinter(writer,
                    CSVFormat.DEFAULT.withHeader("ClienteId", "Nome", "PedidoId","Descrição","Valor"))){
            for(Cliente cliente : clientes){
                for(Pedido pedido : cliente.getPedidos()){
                    csvPrinter.printRecord(
                            cliente.getId(),
                            cliente.getNome(),
                            pedido.getId(),
                            pedido.getDescricao(),
                            pedido.getValor()
                    );
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
