package module3;

public class OperadoresLog {
    public static void main(String[] args) {

        boolean t1 = false;
        boolean t2 = false;

        boolean ctv50 = t1 && t2;
        boolean ctv32 = t1 || t2;
        boolean sorvt = ctv50 ^ ctv32;
        boolean sair = t1 || t2;
        boolean saude = !sorvt;

        System.out.println("Comprou tv 50: "+ctv50);
        System.out.println("Comprou tv 32: "+ctv32);
        System.out.println("Tomou  sorvete? "+sorvt);
        System.out.println("Está saudável?" +saude);


    }
}
