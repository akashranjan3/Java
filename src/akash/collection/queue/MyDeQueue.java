package akash.collection.queue;

import java.util.*;

public class MyDeQueue {

    public static void main(String[] args) {

        Deque<String> names = new ArrayDeque<>();
        names.add("Akash ");
        names.add("Ranjan ");
        names.add("Verma ");
        names.add("Ram ");
        names.add("Kumar ");  //not safe to use
        names.offer("Bro ");  // safe to use
        names.offer("Dude ");
        names.offer("Yes ");
   /*   names.remove();//not safe
          names.poll();// safe
        names.removeFirst();
         names.removeLast();*/


        Iterator it = names.iterator();
        System.out.print("linkedList=> ");
        while (it.hasNext())
            System.out.print(" " + it.next());
        System.out.println();
        System.out.println("====================================================================");


        Queue<Integer> student = new ArrayDeque<>() {
        };
        student.offer(3);
        student.offer(9);
        student.offer(7);
        student.offer(5);
//        student.offer(null);
        student.offer(77);
        student.offer(6);
        student.offer(4);
        student.poll();

        Iterator i = student.iterator();
        while (i.hasNext())
            System.out.print(i.next() + " ");

        System.out.println();
        System.out.println("=======================by array deque =============================================");
        Deque<String> emp = new ArrayDeque<>();
        emp.add("akash ");
        emp.addLast("ranjan ");
        emp.addFirst("Mr ");
        emp.removeLast();
        emp.removeFirst();


        emp.forEach(s -> System.out.print(s));

        System.out.println(".................... by linked list .........................");

        Deque<String> some = new LinkedList<>();
        some.add("akash ");
        some.addLast("ranjan ");
        some.addFirst("Mr ");
        some.removeLast();
        some.removeFirst();

    }


}


