package module12.generics;

public class CaixaTeste {
    public static void main(String[] args) {
        Caixa<String> caixaA = new Caixa();
        caixaA.guardar("XXX");

        String coisaA = caixaA.abrir();
        System.out.println(coisaA);
    }
}
