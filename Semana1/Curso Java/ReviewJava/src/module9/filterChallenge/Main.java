package module9.filterChallenge;


/*
* 1. 2 expressões lambdas (filter)
* 2. usando map no final
* 3. apenas uma checagem por filter
* 4. carro isento de ipva ou não
* 5. consome muito ou não
*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("Chevrolet","Chevette",1990,1.6,13.7);
        Car c2 = new Car("Chevrolet","Opala", 1979,4.1,8.9);
        Car c3 = new Car ("Ford", "Landau", 1967, 4.9,6.7);
        Car c4= new Car("Ford", "Maverick", 1979, 5.0,5.5);
        Car c5 = new Car("Volkswagem", "Gol", 1992, 1.8,12.5);
        Car c6= new Car("Toyota","Corolla",2024,2.0,18.5);

        List<Car> cars = Arrays.asList(c1,c2,c3,c4,c5,c6);

        //classifica o carro como beberrão(consome muita gasolina)
        Predicate<Car> drinker = c -> c.getEfficiency() < 10.0;

        //classifica o carro como chato
        Predicate<Car> itsBoring = c -> c.getBrand()!= "Toyota";

        //carro velho sempre fuma e bebe, nesse caso se ele faz mais de 10km/l ele apenas fuma kkkkkk.
        Predicate<Car> onlySmoke = c -> c.getEfficiency() > 10.0;

        //essa é uma função que filtra se o carro dele se enquadra nos 3 predicados anteriores.
        Function<Car, String> perfect = c -> String.format("Parabéns, você escolheu um %s" +
                " e vai ser muito feliz morando no posto com seu consumo de %.1f Km/L",
                c.getModel(), c.getEfficiency());

        //essa também, porém ela filtra um caso em que o carro é antigo porém não é beberrão.
        Function<Car, String> perfectToo =  c -> String.format("Parabéns, você escolheu um %s" +
                " e vai ser muito feliz com seu idosinho de %d", c.getModel(), c.getYear());

        cars.stream()
                .filter(drinker)
                .filter(itsBoring)
                .map(perfect)
                .forEach(System.out::println);

        cars.stream()
                .filter(itsBoring)
                .filter(onlySmoke)
                .map(perfectToo)
                .forEach(System.out::println);
    }
}
