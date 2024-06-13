package akash.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyHashSet {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("akash");
        names.add("ranjan");
        names.add("verma");

        names.add("mister");
        names.add("verma");
        if(names.contains("akash")){

        }

        Iterator it = names.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        System.out.println("........................");
        names.forEach(i-> System.out.println(i));

        ArrayList<Integer> i1 = new ArrayList<>();
        ArrayList<Integer> i2 = new ArrayList<>();
        i1.add(22);
        i1.add(12);
        i2.add(22);
        i2.add(12);
        i2.add(2);
        i1.add(2);
        i1.add(9);
        i2.add(9);
        System.out.println(i1.equals(i2));
        System.out.println("i1".equals("i1"));

    }
}
