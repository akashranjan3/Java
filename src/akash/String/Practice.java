package akash.String;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        String name = "Akash Ranjan Verma";
        name.toCharArray();
        System.out.println(name.toCharArray());
        for (Character c : name.toCharArray()){
            System.out.println(c);
        }
        char[] characters = name.toCharArray();
//        Arrays.stream(characters[])

    }
}
