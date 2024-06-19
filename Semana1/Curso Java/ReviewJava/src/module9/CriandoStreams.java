package module9;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {

        Consumer<String> print = System.out::println;

        Stream<String> langs = Stream.of("Java", "C#", "Python \n");
        langs.forEach(print);

        String [] maisLangs = {"JS", "GO LANG", "Kotlin"};

        Stream.of(maisLangs).forEach(print);
    }
}
