package akash.collection.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MyTreeSet {

    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add("akash");
        names.add("ranjan");
        names.add("verma");
        names.add("mister");

        Set<String> names1 = new TreeSet<>();
        names1.add("akash1");
        names1.add("ranjan1");
        names1.add("verma");
        names1.add("mister1");

        names.retainAll(names1);


        Iterator it = names.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
