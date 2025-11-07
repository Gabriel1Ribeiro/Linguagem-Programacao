package school.sptech;

public class Alimento extends Produto {

    private int quantVitamina;

    public Alimento(int codigo, String descricao, double preco, int quantVitamina) {
        super(codigo, descricao, preco);
        this.quantVitamina = quantVitamina;
    }

    @Override
    public double getValorTributo() {
        return getPreco() * 0.15;
    }

    @Override
    public boolean validar() {
        return getPreco() > 0 && quantVitamina > 0;
    }

    public int getQuantVitamina() {
        return quantVitamina;
    }

    public void setQuantVitamina(int quantVitamina) {
        this.quantVitamina = quantVitamina;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "quantVitamina=" + quantVitamina +
                "} " + super.toString();
    }
}
