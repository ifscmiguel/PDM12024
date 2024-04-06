import java.util.Scanner;

public class Teste1 {
    public static void main(String[] args) {
        String nome = "Maria";
        int idade = 20;
        
        String nome2 = "Ana";
        int idade2 = 22;

        // comparação de strings com java
        if(nome.equalsIgnoreCase(nome2)){
            System.out.println("São nomes iguais");
        }
        else{
            System.out.println("São nomes diferentes");
        }

        // comparação de tipos primitivos
        if(idade == idade2){
            System.out.println("Mesma idade");
        }
        else{
            System.out.println("Idades diferentes");
        }
        
        // concatenação
        System.out.println(nome + " possui " + idade + " anos");

        // entrada de dados
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número");

        int x = leitor.nextInt();
        char a = leitor.next().charAt(0);

        System.out.println("Você digitou "+x);
    }
}
