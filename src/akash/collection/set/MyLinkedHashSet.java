package akash.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class MyLinkedHashSet {

    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>();
        names.add("akash");
        names.add("ranjan");
        names.add("verma");
        names.add("mister");
        Iterator it = names.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
