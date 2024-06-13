package linkedListImpementation;

public class DoubleLinkedList {
    Node head;
    Node tail;


    class Node{
        int data;
        Node previous;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    public void insertFirst(int n ){
        Node node = new Node(n);
        if(head==null){
            head = node;
            tail = node;
        }else{
            node.next = head;
            head.previous = node;
            head = node;

        }
    }
    public void insertLast(int n ){
        Node node = new Node(n);
        if(tail==null){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            node.previous = tail;
            tail = node;


        }
    }
    public  void print(){
        System.out.print("Printing = > ");
        Node temp = head;
        while(temp!= null){
            System.out.print(" " + temp.data);
            temp = temp.next;

        }
        System.out.println();
    }
    public  void printReverse(){
        System.out.print("Printing reverse = > ");
        Node temp = tail;
        while(temp!= null){
            System.out.print(" " + temp.data);
            temp = temp.previous;

        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoubleLinkedList dl = new  DoubleLinkedList();
        dl.insertLast(1);
        dl.insertFirst(8);
        dl.insertFirst(66);
        dl.insertLast(1);
        dl.insertFirst(4);
        dl.insertFirst(12);

        dl.print();
        dl.insertLast(100);
        dl.insertLast(200);
        dl.insertLast(300);
        dl.insertLast(400);
        dl.insertLast(500);
        dl.print();
        dl.printReverse();
    }



}
