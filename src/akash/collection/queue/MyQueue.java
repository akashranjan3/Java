package akash.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Akash ");
        queue.offer("ranjan ");
        queue.offer("verma ");
        queue.offer("is ");
        queue.offer(" a ");
        queue.offer(" hardworking ");
        queue.offer(" guy ");
        queue.offer(" so ");
        queue.offer(" responsible");


        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.offer(" mr");
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.poll();
        queue.add("akash ");
        queue.add("ranjan ");
        queue.add("verma ");
        for (String i :
                queue) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }
}
