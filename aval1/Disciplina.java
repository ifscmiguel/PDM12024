import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private int ch;
    private String nome;
    private List<Aluno> alunos = new ArrayList<>();
    private Professor prof;

    public Disciplina(int ch, String nome) {
        if(ch<=0 || ch>200){
            throw new IllegalArgumentException("CH inválida");
        }
        this.ch = ch;
        this.nome = nome;
    }

    public void addAluno(Aluno a){
        alunos.add(a);
    }

    public void listarAlunos(){
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }

    public Professor getProfessor(){
        return this.prof;
    }

    public void setProfessor(Professor p){
        this.prof = p;
    }


    
}
