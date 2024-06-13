package prac.doPracOfStack;

 class Main {

        Node head;
        int length = 0;

        public void add(int a) {
            Node insertMe = new Node(a);
            if (head != null) {
                insertMe.next = head;
                head = insertMe;
            } else {
                head = insertMe;
            }
            length++;
        }
        public  void delete(){
            if(head != null){
                head  = head.next;
                length--;
            }else{
                System.out.println("I am already null");
            }
        }

        public void  length(){
            System.out.println("Total Element in stack in "+length);
        }
        public void printStack() {
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
     public int getMin() {
         int min = head.data;

         Node temp = head;

         while (temp != null) {

             if(min>temp.data) {min = temp.data;}
             temp = temp.next;
         }
         return min;
     }

         class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
            }
        }



    public static void main(String[] args) {
        Main minStack = new Main();
        minStack.add(3);
        minStack.add(93);
        minStack.add(9);
        minStack.add(13);
        minStack.add(83);
        minStack.add(93);
        System.out.println(minStack.getMin());
        minStack.printStack();
        minStack.delete();
        minStack.printStack();
        minStack.delete();
        minStack.printStack();
        minStack.delete();
        minStack.printStack();
        minStack.length();
        minStack.delete();
        minStack.printStack();
        minStack.delete();
        minStack.printStack();
        minStack.delete();
        minStack.printStack();
        minStack.delete();
        minStack.printStack();

    }
}
