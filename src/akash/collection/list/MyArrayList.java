package akash.collection.list;

import java.util.*;
import java.util.stream.Stream;

public class MyArrayList {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<String> names1 = List.of("AA", "oo", "ll");
        names.add("akash ");
        names.add("ranjan ");
        names.add("r");
        names.add("ro");
        names.add("lppp ");
        names.add("Verma ");







        Iterator it = names.iterator();
        while (it.hasNext())
            System.out.println(it.next());


        System.out.println(".........................................");
String[] plus = {"akash", "ranjan","Verma"};

        Stream<String> st = Arrays.stream(plus);


        st.forEach(a-> System.out.println(a));
        System.out.println(".........................................");

    }

}
