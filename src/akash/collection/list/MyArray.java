package akash.collection.list;

import java.util.Arrays;

public class MyArray {

    public static void main(String[] args) {
        int[] num = {8 , 9 , 6 , 88, 90 , 5 , 9 ,90};
        System.out.println(Arrays.toString(num));
        System.out.println(num.length);
        System.out.println(Arrays.stream(num).count());

    }
}
