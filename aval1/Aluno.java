import java.util.ArrayList;
import java.util.List;

/**
 * Aluno
 */
public class Aluno extends Pessoa{

    private int num_matricula;
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Aluno(String nome, int num_matricula){
        super(nome);
        this.num_matricula = num_matricula;
    }

    public List<Disciplina> getDisciplinas(){
        return this.disciplinas;
    }
}