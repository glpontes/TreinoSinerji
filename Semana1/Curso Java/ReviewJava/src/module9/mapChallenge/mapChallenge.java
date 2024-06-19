package module9.mapChallenge;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
* 1. Número para string binária... 6 => "110"
* 2. Reverter a string... "110" => "011"
* 3. converter de volta para inteiro => "011" => 3
*/


public class mapChallenge {

    public static void main(String[] args) {


        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        nums.stream()
                .map(Integer::toBinaryString)
                .map(binaryString -> new StringBuilder(binaryString).reverse().toString())
                .map(binaryString -> Integer.parseInt(binaryString,2))
                .forEach(System.out::println);
    }
}
