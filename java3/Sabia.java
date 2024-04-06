public class Sabia extends Animal implements Passaro {
    
    public Sabia(){
        super("Sabiá", 2);
    }

    // implementação do método abstrato falar() de Animal
    public void falar(){
        System.out.println("piu piu piu");
    }

    // implementação do método abstrato voar() de Passaro
    public void voar(){
        System.out.println("estou voando ... ");
    }

}
