package udemy.dsa.linkedList.one;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(5);
        myLinkedList.getHead();
        ;
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();


        System.out.println("\n\n.................................");

        LinkedList myLinkedList2 = new LinkedList(1);
        myLinkedList2.append(3);
        myLinkedList2.append(5);
        myLinkedList2.append(7);
        myLinkedList2.append(11);
        myLinkedList2.append(13);
        myLinkedList2.append(17);

        System.out.println("");
        myLinkedList2.printList();
        System.out.println("");
        myLinkedList2.getLength();


        myLinkedList2.remove();
        System.out.println("");
        myLinkedList2.printList();
        System.out.println("");
        myLinkedList2.getLength();

        myLinkedList2.remove();
        System.out.println("");
        myLinkedList2.printList();
        System.out.println("");
        myLinkedList2.getLength();

        myLinkedList2.remove();
        System.out.println("");
        myLinkedList2.printList();
        System.out.println("");
        myLinkedList2.getLength();

        myLinkedList2.remove();
        System.out.println("");
        myLinkedList2.printList();
        System.out.println("");
        myLinkedList2.getLength();

        myLinkedList2.remove();
        System.out.println("");
        myLinkedList2.printList();
        System.out.println("");
        myLinkedList2.getLength();

        myLinkedList2.remove();
        System.out.println("");
        myLinkedList2.printList();
        System.out.println("");
        myLinkedList2.getLength();

        myLinkedList2.remove();
        System.out.println("");
        myLinkedList2.printList();
        System.out.println("");
        myLinkedList2.getLength();

        myLinkedList2.remove();
        System.out.println("");
        myLinkedList2.printList();
        System.out.println("");
        myLinkedList2.getLength();

        myLinkedList2.prePend(1);
        myLinkedList2.prePend(5);
        myLinkedList2.prePend(10);
        myLinkedList2.prePend(15);
        myLinkedList2.prePend(20);

        myLinkedList2.printList();
        myLinkedList2.getHead();
        ;
        myLinkedList2.getTail();
        myLinkedList2.getLength();

        System.out.println();
        myLinkedList2.removeFirst();
        myLinkedList2.printList();
        myLinkedList2.getHead();
        ;
        myLinkedList2.getTail();
        myLinkedList2.getLength();

        System.out.println();
        myLinkedList2.removeFirst();
        myLinkedList2.printList();
        myLinkedList2.getHead();
        ;
        myLinkedList2.getTail();
        myLinkedList2.getLength();

        System.out.println();
        myLinkedList2.removeFirst();
        myLinkedList2.printList();
        myLinkedList2.getHead();
        ;
        myLinkedList2.getTail();
        myLinkedList2.getLength();

        System.out.println();
        myLinkedList2.removeFirst();
        myLinkedList2.printList();
        myLinkedList2.getHead();
        ;
        myLinkedList2.getTail();
        myLinkedList2.getLength();

        System.out.println();
        myLinkedList2.removeFirst();
        myLinkedList2.printList();
        myLinkedList2.getHead();
        ;
        myLinkedList2.getTail();
        myLinkedList2.getLength();

        System.out.println();
        myLinkedList2.removeFirst();
        myLinkedList2.printList();
        myLinkedList2.getHead();
        ;
        myLinkedList2.getTail();
        myLinkedList2.getLength();

        System.out.println();
        myLinkedList2.removeFirst();
        myLinkedList2.printList();
        myLinkedList2.getHead();
        ;
        myLinkedList2.getTail();
        myLinkedList2.getLength();

        System.out.println();
        myLinkedList2.removeFirst();
        myLinkedList2.printList();
        myLinkedList2.getHead();
        ;
        myLinkedList2.getTail();
        myLinkedList2.getLength();

        System.out.println();
        myLinkedList2.removeFirst();
        myLinkedList2.printList();
        myLinkedList2.getHead();
        ;
        myLinkedList2.getTail();
        myLinkedList2.getLength();


        myLinkedList2.append(3);
        myLinkedList2.append(5);
        myLinkedList2.append(7);
        myLinkedList2.append(11);
        myLinkedList2.append(13);
        myLinkedList2.append(17);
        myLinkedList2.printList();
        System.out.println("number at index 1 -> " + myLinkedList2.get(1));
        System.out.println("number at index 0 -> " + myLinkedList2.get(0));
        System.out.println("number at index 4 -> " + myLinkedList2.get(4));
        System.out.println("number at index 10 -> " + myLinkedList2.get(10));
        System.out.println("number at index 5 -> " + myLinkedList2.get(5));


        myLinkedList2.set(0, 100);
        System.out.println();
        myLinkedList2.printList();

        myLinkedList2.set(10, 100);
        System.out.println();
        myLinkedList2.printList();

        myLinkedList2.set(2, 200);
        System.out.println();
        myLinkedList2.printList();


        System.out.println("\n...insert.....\n");
        myLinkedList2.insert(1, 77);
        myLinkedList2.printList();
        System.out.println();

        myLinkedList2.insert(0, 14);
        myLinkedList2.printList();
        System.out.println();

        myLinkedList2.insert(7, 33);
        myLinkedList2.printList();
        System.out.println();

        myLinkedList2.insert(5, 500);
        myLinkedList2.printList();
        System.out.println();

        myLinkedList2.insert(1, 500);
        myLinkedList2.printList();
        System.out.println();

        System.out.println("\n...reverse.....\n");


        myLinkedList2.getLength();
        myLinkedList2.reverse();
        myLinkedList2.printList();
        System.out.println();

    }
}
