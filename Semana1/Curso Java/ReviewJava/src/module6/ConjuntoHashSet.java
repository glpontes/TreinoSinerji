package module6;

import java.util.HashSet;

public class ConjuntoHashSet {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add("Test");
        conjunto.add("Testado");
        conjunto.add(1);
        conjunto.add(2.6);

        conjunto.remove(1);

        /* esse é um conjunto organizado e
         padronizado para aceitar apenas strings*/
        HashSet<String> lista = new HashSet<String>();

        /* Esta linha 19 tenta inserir um inteiro e apresenta erro
         devido a padronização do conjunto*/
         //lista.add(1);
         lista.add("TEST");

    }
}
