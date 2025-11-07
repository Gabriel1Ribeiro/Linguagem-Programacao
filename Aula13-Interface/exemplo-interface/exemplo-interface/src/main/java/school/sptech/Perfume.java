package school.sptech;

public class Perfume extends Produto {

    private String fragrancia;

    public Perfume(int codigo, String descricao, double preco, String fragrancia) {
        super(codigo, descricao, preco);
        this.fragrancia = fragrancia;
    }

    @Override
    public double getValorTributo() {
        return getPreco() * 0.27;
    }

    public String getFragrancia() {
        return fragrancia;
    }

    public void setFragrancia(String fragrancia) {
        this.fragrancia = fragrancia;
    }

    @Override
    public String toString() {
        return "Perfume{" +
                "fragrancia='" + fragrancia + '\'' +
                "} " + super.toString();
    }
}
