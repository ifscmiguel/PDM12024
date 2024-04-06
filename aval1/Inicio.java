/**
 * Inicio
 */
public class Inicio {

    public static void main(String[] args) {
        try {

            Aluno a1 = new Aluno("Miguel", 123);
            Aluno a2 = new Aluno("Raimundo", 333);
            Aluno a3 = new Aluno("Clara", 456);

            Professor p = new Professor("Alcides", "Redes");
            Disciplina d = new Disciplina(60, "Redes 2");

            d.setProfessor(p);
            d.addAluno(a3);
            d.addAluno(a2);
            d.addAluno(a1);

            System.out.println("Alunos:");
            d.listarAlunos();
            System.out.println("Professor:");
            System.out.println(d.getProfessor().getNome());
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}