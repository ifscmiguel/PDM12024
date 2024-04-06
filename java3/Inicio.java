public class Inicio {

    public static void main(String[] args) {

        Cachorro cooper = new Cachorro();
        cooper.falar();
        cooper.nadar();

        System.out.println("-----------------");

        Gato jumelo = new Gato();
        jumelo.falar();
        jumelo.nadar();

        System.out.println("-----------------");

        Sabia sabia = new Sabia();
        sabia.falar();
        sabia.voar();
        sabia.nadar();

        
        Calculadora.somar(2, 3);
    }
}