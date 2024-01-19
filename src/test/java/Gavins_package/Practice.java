package Gavins_package;

import java.util.HashMap;
import java.util.Map;

public class Practice {

    public static void main(String[] args) {


        Map<String, String> map = new HashMap<>(Map.of("Gavin", "Wallace"));
        map.forEach((first,last)-> System.out.println(first+" "+last));


    }
}
