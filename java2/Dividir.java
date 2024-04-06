import java.util.Scanner;

public class Dividir {
    
    // método construtor
    public Dividir(){
        System.out.println("novo obj Dividir");
    }

    /**
     * Divide dois número
     * @param n1
     * @param n2
     * @return divisão n1/n2
     */
    public static double resultado(int n1, int n2){
        try {            
            double resultado = n1/n2;
            return resultado;
        } catch (Exception e) {
            System.out.println("Ops, divisão por zero!");
            return 0.0;
        }
    }

}
