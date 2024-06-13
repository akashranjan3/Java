package akash.collection.stack;

import java.util.*;

public class MyStack {

    public static void main(String[] args) {
        Stack<String> names = new Stack<>();
        names.push("akash ");
        names.push("ranjan ");
        names.push("Verma ");
        names.push("Vijay ");
        names.push("Hajare ");
        names.push("Lolo");
        names.pop();



        Iterator it = names.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        System.out.println("...............");
        System.out.println(names);

        System.out.println(".........----------------------------------......");
        Stack<Integer> some = new Stack<>();

        some.push(6);
        some.push(8);
        some.push(5);
        some.push(52);
        some.push(55);
        some.push(54);
        System.out.println();
        System.out.println(some);
        some.pop();
        System.out.println(some);


        List<String> dim = Arrays.asList("Aksh ", "Ranjan", "Rahul", "Ram ", "Zabra", "kzng Khli");


        System.out.println(dim.stream().max(Comparator.comparingInt(a -> a.length())));
        System.out.println(dim.stream().max(Comparator.comparing(a -> a.length())));







    }

}
