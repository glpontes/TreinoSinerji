package module5;

public class Jantar {
    public static void main(String[] args) {
        Comida comida1 = new Comida("Cuscuz", 0.403);
        Comida comida2 = new Comida("Charque", 0.200);

        Pessoa p = new Pessoa("Gabriel", 64);
        System.out.println(p.pessoaMessage());
        p.comer(comida1);
        p.comer(comida2);
        System.out.println(p.pessoaMessage());

    }
}
