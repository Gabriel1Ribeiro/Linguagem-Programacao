package school.sptech;

public class Main {

    public static void main(String[] args) {

        Servico s1 = new Servico("Netflix", -60.0);
        Alimento a1 = new Alimento(
                1, "Batata", 4.0, 2);
        Alimento a2 = new Alimento(
                3, "Morango", 10.0, 3);
        Perfume p1 = new Perfume(
                2, "Cebolinha 200ml", 19.90,
                "Aloma de lua");

        Tributo minhaCompra = new Tributo();
        minhaCompra.adicionarTributavel(s1);
        minhaCompra.adicionarTributavel(a1);
        minhaCompra.adicionarTributavel(a2);
        minhaCompra.adicionarTributavel(p1);

        minhaCompra.exibirTodos();
        System.out.printf("Soma dos tributos: %.2f%n",
                minhaCompra.calcularTotalTributo());
        System.out.println("Vitaminas totais: "
                + minhaCompra.calcularTotalVitaminas());
    }
}
