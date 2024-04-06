// classes abstratas não podem ser instanciadas
public abstract class Animal {
    
    public String tipo;
    public String cor;
    public int patas;
    public double peso;

    public Animal(String tipo, int patas){       
        System.out.println("Sou um "+tipo+" de "+patas+" patas!");
    }

    public Animal(String tipo){       
        System.out.println("Sou um "+tipo);
    }

    public void nadar(){
        System.out.println("adoro nadar");
    }

    public abstract void falar();
}
