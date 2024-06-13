package akash.collection.map;

import java.util.*;

public class MyHashMap {

    public static void main(String[] args) {
        Map<String, String> name = new HashMap<>();


        name.put("Akash", "ranjan");
        name.put("Vinay", "Singh");
        name.put("Vinay", "verma");
        name.put("Amar", "Nath");
        name.put("Vijay", "Hajare");
        System.out.println();
        name.forEach((i,j)-> System.out.println(i+ "..........." + j));

//        System.out.println(name.entrySet());

Iterator i = name.entrySet().iterator();
while (i.hasNext())
    System.out.println(i.next());


        System.out.println("............................");

        name.forEach((j,l)-> System.out.println("..."+j+"..."+l));


        System.out.println(name.containsKey("Amar"));
    }




}

