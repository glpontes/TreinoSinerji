package module6;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();
        Usuario u1 = new Usuario("Gabriel");


        lista.add(u1);
        lista.add(new Usuario("GG"));
        lista.add(new Usuario("GBB"));

        System.out.println(lista.get(3).nome);
    }
}
