package linkedListImpementation;



public class MyLinkedList {
    Node head;




    public void addFirst(String data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void addLast(String data) {
        Node node = new Node(data);

        Node temp = head;
//        System.out.println("hashCode of temp => "+ temp.hashCode());
//        System.out.println("hashCode of head => "+ head.hashCode());
     while(temp.next!=null) {
         temp = temp.next;
//         System.out.println("hashCode of next =>" + temp.hashCode());
     }
     temp.next = node;
    }


    public  void printLinkedList(){
        System.out.print("LinkedList = > ");
        Node temp = head;
        while ( temp!=null ){
            System.out.print(" "+ temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;

        }


    }
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst("Boy");
        myLinkedList.addFirst("Good");
        myLinkedList.addFirst("A ");
        myLinkedList.addFirst("Is");
        myLinkedList.addFirst("Verma ");
        myLinkedList.addFirst("ranjan");
        myLinkedList.addFirst("akash");
        myLinkedList.printLinkedList();
        myLinkedList.addLast("Trust him");
        myLinkedList.printLinkedList();

    }

}
