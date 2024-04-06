public class Desafio1 {
    public static void main(String[] args) {
        boolean temCartaoDeCredito = true;
        boolean temDinheiroNaConta = false;

        // a negação do ou é E
        if(!temCartaoDeCredito && !temDinheiroNaConta){
            System.out.println("NÃO pode comprar");
        }
        else{
            System.out.println("PODE comprar!");
        }

    }
}
