package module5;

public class Pessoa {
    String nome;
    double peso;

    public Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida){
        this.peso += comida.pesoComida;
    }

    String pessoaMessage(){
        return "Nome: " + nome + "\nPeso: " + peso;
    }
}
