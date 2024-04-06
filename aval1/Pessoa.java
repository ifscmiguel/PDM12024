public abstract class Pessoa {
    private String nome;
    private String cpf;

    /* método construtor */
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }   
    
}
