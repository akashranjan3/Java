package prac.doPracOfStack.reverse;

public class Main {
     Node head;
      class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    public void insert(int n){
        Node node = new Node(n);
        if(head!=null){
            node.next = head;
            head = node;
        }else head = node;
    }

    public void insertFromLast(int n ){
          Node node = new Node(n);
          Node last = head;
         /* while(last.next!=null){
              last = last.next;
          }
          last.next = node;

          */
        Node temp = head;
          while (temp.next!=null){


              temp = temp.next;
          }
          temp.next = node;
    }

public  void removeLast(){
          Node last = head;
          while(last.next.next!=null){
              last = last.next;
          }
          last.next = null;
}

    public void print(){
        System.out.print("printing => ");
          Node temp = head;

          while (temp!=null){

              System.out.print(temp.data+" _ ");

              temp = temp.next;
          }
        System.out.println( " done");
    }
    public Node reverse(){
          Node headReturn = null;
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" _ ");

            Node newNode = new Node(temp.data);
            if(headReturn !=null){
                newNode.next = headReturn;
                headReturn = newNode;
            }else{
                headReturn = newNode;
            }
            temp = temp.next;
        }
        return headReturn;
    }


    public static void main(String[] args) {
Main ll = new Main();
ll.insert(6);
ll.insert(7);
ll.insert(56);
ll.insert(2);
ll.insert(56);
ll.insert(160);
ll.insert(1);
ll.print();
ll.print();
ll.print();
ll.insertFromLast(90);
ll.insertFromLast(900);
ll.insertFromLast(9000);ll.insertFromLast(80);
ll.insertFromLast(500);
ll.insertFromLast(5000);ll.insertFromLast(4);
ll.insertFromLast(14);
ll.insertFromLast(66);
ll.print();
ll.print();
ll.print();
ll.removeLast();
ll.print();
    }

}
