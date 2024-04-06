import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Inicio
 */
public class Inicio {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<Produto>();
        produtos.add( new Produto("teclado", 40.0) );
        produtos.add( new Produto("mouse", 10.0) );
        produtos.add( new Produto("pen drive", 5.0) );
        produtos.add( new Produto("no-break", 400.0) );
        produtos.add( new Produto("headset", 80.0) );
        produtos.add( new Produto("mouse pad", 18.7) );

        Scanner leitor = new Scanner(System.in);
        int opcao = 1;
        Carrinho c = new Carrinho();
        while(opcao==1){
            System.out.println("Digite o id do produto, ou -1 para encerrar.");
            int id = leitor.nextInt();
            if(id==-1){
                break;
            }
            System.out.println("Digite a quantidade:");
            int qnt = leitor.nextInt();
            for(Produto p:produtos){
                if(p.getId()==id){
                    try {
                        c.addProduto(p, qnt);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.out.println("Repita a operação");
                    }                    
                }
            }
        }
        c.calcularCompra();        
        leitor.close();
    }
}