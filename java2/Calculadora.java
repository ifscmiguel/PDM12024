import java.util.Scanner;

/**
 * Calculadora
 */
public class Calculadora {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite dois números inteiros");
        int n1 = leitor.nextInt();
        int n2 = leitor.nextInt();
        leitor.close();
        // faço uma instância (objeto) de Dividir
        //Dividir d = new Dividir();
        // chama o método resultado do objeto d
        //System.out.println(   d.resultado(n1, n2)  );
        System.out.println(Dividir.resultado(n1, n2));
    }
}