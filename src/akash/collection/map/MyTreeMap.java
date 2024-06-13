package akash.collection.map;

import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {

    public static void main(String[] args) {
        Map<String, String> name = new TreeMap<>();


        name.put("Akash", "ranjan");
        name.put("Vinay", "Singh");
        name.put("Amar", "Nath");
        name.put("Vijay", "Hajare");
        name.put("Vinay", "Singh");

        System.out.println(name.entrySet());






    }

}
