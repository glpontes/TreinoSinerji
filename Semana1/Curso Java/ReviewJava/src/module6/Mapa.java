package module6;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {
        Map<Integer, String> users = new HashMap<>();

        users.put(1, "Gabriel");

        System.out.println(users.size());
    }
}
