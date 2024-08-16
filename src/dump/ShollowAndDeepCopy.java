package dump;

import java.util.Arrays;

public class ShollowAndDeepCopy {


    public static void main(String[] args) {

        String a = "ko99ygg";
        String b = a;
//        a = "jijk";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
//        System.out.println(b.);
        System.out.println(a==new String("ko99ygg"));
        System.out.println((new String("ko99ygg")).hashCode());

int [] n = {8, 9, 90, 78, 7, 90, 67, 8};


int[] n1 = new int[n.length];
for (int i = 0; i < n.length; i++)
    n1[i] = n[i]+100;


        System.out.println(Arrays.toString(n));
        System.out.println(Arrays.toString(n1));

    }

}
