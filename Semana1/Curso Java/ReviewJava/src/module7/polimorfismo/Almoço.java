package module7.polimorfismo;

public class Almoço {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(90);

        Arroz c1 = new Arroz(0.4);
        Feijao c2 = new Feijao(0.8);
        Sorvete c3= new Sorvete(0.2);

        p1.comer(c3);

        System.out.println("Peso: " + p1.getPeso());
    }
}