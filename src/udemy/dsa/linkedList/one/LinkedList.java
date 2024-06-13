package udemy.dsa.linkedList.one;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;

        }
    }

    public void remove() {
        if (head == null) {
            System.out.println("Your LinkedList is already empty, can not remove anymore.");
        } else if (head.next == null) {
            System.out.println("Your LinkedList is empty now.");
            head = null;
            tail = null;
            length--;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            tail = temp;
            tail.next = null;
            length--;
        }
    }

    public void prePend(int n) {

        Node node = new Node(n);
        if (head == null) {
            tail = node;
        }
        node.next = head;
        head = node;
        length++;


    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
            length--;
            if (length == 0) {
                tail = null;
            }
        } else {
            System.out.println("Linked list is already empty");
        }

    }


    public void append(int num) {
        Node node = new Node(num);

        if (head == null) {
            this.head = node;
            this.tail = node;

        } else {
            tail.next = node;
            tail = node;
        }
        length++;
    }

    public int get(int index) {
        Node temp = head;
        int tempNum = 0;

        if (index < 0 || index >= length) {
            return 0;
        } else {
            while (tempNum != index) {
                temp = temp.next;
                tempNum++;
            }
        }
        return temp.data;
    }

    public  void reverse(){

        Node temp = head;
        head = tail;
        tail = temp;
        Node previousNode = null ;
        Node nextNode  = temp.next;
        for(int i = 0 ; i < length; i++){
            nextNode = temp.next;
            temp.next = previousNode;
            previousNode = temp;
            temp = nextNode;
        }

    }



    public boolean set(int index, int value) {
        if (index < 0 || index >= length) {
            return false;
        } else {
            Node tempNode = head;
            int tempNum = 0;
            while (tempNum != index) {
                tempNum++;
                tempNode = tempNode.next;
            }
            tempNode.data = value;
        }
        return true;

    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            System.out.println("false");
            return false;
        } else {
            if (index == 0) {
                prePend(value);
            } else if (index == length) {
                append(value);
            } else {

                int counter = 0;
                Node node = head;
                while (counter != index - 1) {
                    counter++;
                    node = node.next;
                }
                Node temp = node;
                Node newNode = new Node(value);
                Node nextNode = node.next;
                temp.next = newNode;
                newNode.next = nextNode;

                length++;
            }


        }
        return true;
    }

    public void getHead() {
        if (head != null)
            System.out.println("Head: " + head.data);
        else
            System.out.println("Head is null ");
    }

    public void getTail() {
        if (tail != null)
            System.out.println("tail: " + tail.data);
        else
            System.out.println("tail is null ");
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }


    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
