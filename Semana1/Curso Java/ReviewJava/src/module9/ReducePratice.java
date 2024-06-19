package module9;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class ReducePratice {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Gabriel", 10.0);
        Aluno a2 = new Aluno("Lucas", 8.9);
        Aluno a3 = new Aluno("Cledson", 7.8);
        Aluno a4 = new Aluno("Gão", 9.1);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);

        Predicate<Aluno> aprovado = a -> a.nota >=7;
        Function<Aluno, Double> apenasNota = a -> a.nota;
        BinaryOperator<Double> somatorio = (a, b) -> a + b;

        alunos.parallelStream()
                .filter(aprovado)
                .map(apenasNota)
                .reduce(somatorio)
                .ifPresent(System.out::println);
    }
}
