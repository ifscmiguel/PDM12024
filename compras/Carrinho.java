import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> produtos;
    private List<Integer> quantidades;

    public Carrinho() {
        this.produtos = new ArrayList<Produto>();
        this.quantidades = new ArrayList<Integer>();
    }

    public void addProduto(Produto p, int qnt){
        if(qnt<1){
            throw new IllegalArgumentException("Quantidade deve ser positiva!");
        }
        this.produtos.add(p);
        this.quantidades.add(qnt);
    }

    // calcular total da compra
    public void calcularCompra(){
        System.out.println("===============================");
        System.out.println("     Nota Fiscal ");
        System.out.println("===============================");
        double total = 0;

        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);
            int qnt = quantidades.get(i);
            System.out.println(p.getNome()+ " R$ "+p.getValor() + " x"+qnt);
            total += p.getValor()*qnt;
        }

        System.out.println("===============================");
        System.out.println("total da compra: "+total);
    } 

}
