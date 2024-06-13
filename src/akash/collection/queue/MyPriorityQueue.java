package akash.collection.queue;

import java.util.*;

public class MyPriorityQueue {

    public static void main(String[] args) {
        Queue<String> names = new PriorityQueue<>();
        names.add("Akash ");
        names.add("Ranjan ");
        names.add("Verma ");
        names.add("Ram ");
        names.add("Kumar ");  //not safe to use
        names.offer("Bro ");  // safe to use
        names.offer("Dude ");
        names.offer("Yes ");
      /*  names.remove();//not safe exception may occur in case of empty queue
        names.poll();// safe exception will not occure even if queue is empty
        names.poll();// safe*/



        Iterator it = names.iterator();
        while (it.hasNext())
            System.out.print(it.next()+ " ");

        System.out.println("---------------------------------------------------------");

        Queue<String> student = new PriorityQueue<>();
        student.offer("Akash ");
        student.offer("Ranjan ");
        student.offer("Verma ");
        student.offer("Is ");
        student.offer("Very ");
        student.offer("Nice ");
        student.offer("Person ");

     Iterator i = student.iterator();
     while (i.hasNext())
         System.out.print(i.next()+" ");

        System.out.println();
        System.out.println("------------------------------------------------------------");
        Queue<String> s = new PriorityQueue<>();

        s.offer("akash");
        s.offer("bkash");
        s.offer("ranjan");
        s.offer("verma");
        s.offer("sachin");
        s.offer("vinay");
        s.offer("cinay");
        s.offer("nikhil");
        s.remove();
        s.poll();



        s.forEach(o-> System.out.print(o + " "));

        }





    }


