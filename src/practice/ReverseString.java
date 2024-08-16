package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Akash ranjan Verma";
        StringBuilder sb = new StringBuilder();
        for (int i = name.length()-1; i >=0; i--) {

        }
        StringBuilder sb2 = new StringBuilder(name);
//        sb2.reverse();
        sb2.insert(0, "Mr. ");
        sb2.setCharAt(0, 'S');
        sb2.deleteCharAt(2);
        sb2 = new StringBuilder(sb2);
        System.out.println(sb2);
        sb2 = new StringBuilder(sb2.substring(3,6));
//        System.out.println(sb2.substring(0,2));
        System.out.println(sb2);
//        System.out.println(sb);
        char[] c = name.toCharArray();

//        List<Character> list = Arrays.asList(Arrays.copyOf(c));


        for (int i = 0; i < c.length; i++) {
            System.out.println("char at "+ i +" is "+  c[i]);
        }

    }

}
