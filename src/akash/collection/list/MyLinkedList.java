package akash.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {

    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("akash ");
        names.add("ranjan ");
        names.add("Verma ");
        names.add("Vijay ");


        Iterator it = names.iterator();
        while (it.hasNext())
            System.out.println(it.next());


    }

}
