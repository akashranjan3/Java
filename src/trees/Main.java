package trees;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void printInOrder(Node n) {
        if (n != null) {
            printInOrder(n.left);
            System.out.print(" " + n.data + " ");
            printInOrder(n.right);
        }

    }

    public static void printPreOrder(Node n) {
        if (n != null) {
            System.out.print(" " + n.data + " ");
            printPreOrder(n.left);
            printPreOrder(n.right);
        }

    }

    public static void printPostOrder(Node n) {
        if (n != null) {
            printPostOrder(n.left);
            printPostOrder(n.right);
            System.out.print(" " + n.data + " ");
        }

    }
    public static void printLevelOrder(Node n) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(n);
        queue.add(null);
        Node first;

        while (!queue.isEmpty()){
            first = queue.poll();

            if(first!=null){
                System.out.print(first.data +" ");
                if(first.left!=null)
                    queue.offer(first.left);

                if(first.right!=null)
                    queue.offer(first.right);
            }else{
                if(!queue.isEmpty()){
                    queue.add(null);
                    System.out.println();
                }
            }

        }

    }

    public static boolean find(Node n, int value) {
        if (n != null) {
            if (n.data == value) {
                return true;
            } else {
                find(n.right, value);
                find(n.left, value);
            }
        }
        return false;
    }

    public static Node buildBST(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node insert = new Node(arr[mid]);
        insert.left = buildBST(arr, start, mid - 1);
        insert.right = buildBST(arr, mid + 1, end);
        return insert;


    }

    public  static  int countNode(Node n){
        if(n==null)
            return 0;

        return countNode(n.left) + countNode(n.right)+ 1;


    }
    public  static  int sumNode(Node n){
        if(n==null)
            return 0;

        return sumNode(n.left) + sumNode(n.right)+ n.data;


    }

    public static void main(String[] args) {


        Node a = new Node(1);
        Node a1 = new Node(2);
        Node a2 = new Node(3);
        Node a3 = new Node(4);
        Node a4 = new Node(5);
        Node a5 = new Node(6);
        Node a6 = new Node(7);


        a.left = a1;
        a.right = a2;
        a1.left = a3;
        a1.right = a4;
        a2.left = a5;
        a2.right = a6;

        printInOrder(a);
        System.out.println();
        printPreOrder(a);
        System.out.println();
        printPostOrder(a);
        System.out.println(find(a, 2));
        System.out.println("------------------------------------------++++++++++----------------------------------");

        Node bst = buildBST(new int[]{1, 7, 8, 12, 34, 78, 90, 109, 155, 172, 200, 289, 800, 901, 999}, 0, 14);

        printInOrder(bst);
        System.out.println();
        printPreOrder(bst);
        System.out.println();
        printPostOrder(bst);
        System.out.println();
        System.out.println("-------------level order--------------------------");
        printLevelOrder(bst);


        System.out.println("-------------Count node--------------------------");
        System.out.println(countNode(bst));
        System.out.println("-------------Sum node--------------------------");
        System.out.println(sumNode(bst));;


    }

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }


}
