import java.util.List;

public class Professor {
    String nome;
    List<Disciplina> listaDisciplinas;

    public void adicionarDisciplina (Disciplina d) {
        this.listaDisciplinas.add(d);
    }

    public void listarDisciplinas() {
        for (Disciplina d: listaDisciplinas) {
            System.out.println(" - " + d);
        }
    }
}
