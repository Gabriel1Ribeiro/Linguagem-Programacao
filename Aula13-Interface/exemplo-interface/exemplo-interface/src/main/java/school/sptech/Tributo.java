package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Tributo {

    private List<TributavelValidavel> tributaveis;

    public Tributo() {
        this.tributaveis = new ArrayList<>();
    }

    public void adicionarTributavel(TributavelValidavel tributavel) {
        if (!tributavel.validar()) {
            System.out.println("Erro de validação");
            return;
        }


        this.tributaveis.add(tributavel);
    }

    public double calcularTotalTributo() {
        double soma = 0;
        for (Tributavel tributavel : tributaveis) {
            soma += tributavel.getValorTributo();
        }
        return soma;
    }

    public int calcularTotalVitaminas() {
        int soma = 0;
        for (Tributavel tributavel : tributaveis) {
            if (tributavel instanceof Alimento alimento) {
                soma += alimento.getQuantVitamina();
            }
        }
        return soma;
    }

    public void exibirTodos() {
        for (Tributavel tributavel : tributaveis) {
            System.out.println(tributavel);
        }
    }
}
