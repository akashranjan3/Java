/*
package linkedListImpementation;

class Solution {
    ListNode head;
    static   class ListNode {
     int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static Solution mergeTwoLists(Solution list1, Solution list2) {
        Solution listnode = null;

        Solution temp =null;
        if(list1==null){
            temp = list2;
            return list2;

        }else if(list2==null){
            temp = list1;
            return list2;
        }
        while(temp!=null){
            ListNode temp1 = list1.head;
            ListNode temp2 = list2.head;
            if(temp1 !=null && temp2 !=null){
                if(temp1.val>temp2.val){
                    listnode.next = temp1.head;
                    temp1 = temp1.next;
                    temp = temp1.next;
                }else{
                    listnode.next = temp2;
                    temp2 = temp2.next;
                    temp = temp2.next;
                }
            }else{
                if(temp1!=null) {listnode.next = temp1;temp = null;}
                else  if(temp2!=null) {listnode.next = temp2;temp = null;}
            }

        }

        return listnode;

    }

    public static  void add(Solution s, int n){
        ListNode a = new ListNode(n);
        if(s.head==null){
            s.head = a;
        }else{
            a.next = s.head;
            s.head = a;

        }
    }
    public static void print( Solution n){
       ListNode temp = n.head;
        System.out.print("Printing => ");
        while ( temp != null){
            System.out.print(temp.val + " . ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Solution s = new  Solution();
        s.add(s,400);
        s.add(s,61);
        s.add(s,11);
        s.add(s,8);
        s.add(s,6);
        s.add(s,3);
        s.add(s,2);
        print(s);


        Solution s2 = new  Solution();
        s2.add(s2,600);
        s2.add(s2,31);
        s2.add(s2,21);
        s2.add(s2,5);
        s2.add(s2,1);

        print(s2);

//        Solution add = mergeTwoLists(s, s2);
    }
}*/
