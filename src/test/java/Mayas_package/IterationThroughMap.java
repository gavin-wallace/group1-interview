package Mayas_package;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterationThroughMap {
    public static void main(String[] args) {

    Map<String, String> names = new HashMap<String, String>();
        names.put("Azerbaijan", "Baku");
        names.put("Turkey", "Ankara");
        names.put("USA", "Washington D.C.");

    // names.entrySet().iterator(); //in this way we can call iterator method, then need to assign this method to variable
    // The Map.entrySet method returns a collection-view of the map, whose elements are of this class.

    //Basically it contains the [key, value] pairs for each element

    Iterator<Map.Entry<String, String>> iterator = names.entrySet().iterator();

    //let`s print all the keys and values

        while (iterator.hasNext()){   //then with help of Entry Object we will get all keys and values
        Map.Entry<String,String> entry = iterator.next();   // then with the help of getKey and getValue methods, we will print out keys and values
        System.out.println(entry.getKey() + "|" + entry.getValue());

    }
}
}


