package akash.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyLinkedashMap {

    public static void main(String[] args) {
        Map<String, String> name = new LinkedHashMap<>();


        name.put("Akash", "ranjan");
        name.put("Vinay", "Singh");
        name.put("Amar", "Nath");
        name.put("Vijay", "Hajare");
        name.put("Vinay", "Singh");
  Map<String, String> name2 = new LinkedHashMap<>();


        name2.put("Vijay", "Hajare");
        name2.put("Akash", "ranjan");
        name2.put("Amar", "Nath");
        name2.put("Vinay", "Singh");
        name2.put("Vinay", "Singh");

        System.out.println(name.entrySet());
        System.out.println(name2.entrySet());

        System.out.println(name.equals(name2));
    }

}
