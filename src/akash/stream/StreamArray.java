package akash.stream;

import java.util.Arrays;
import java.util.List;

public class StreamArray {
    public static void main(String[] args) {
        int[][] ans = new int[][]{
                {1, 3, 5, 6, 7, 8, 9},
                {1, 23, 5, 6, 37, 8, 9},
                {11, 23, 5, 6, 37, 8, 9},
                {11, 3, 15, 6, 37, 8, 9},
                {11, 23, 15, 16, 37, 8, 9}
        };
        int[][] ans2 = Arrays.stream(ans).filter(i-> i[1]>10).toArray(int[][]:: new);
        Arrays.stream(ans2).forEach(i-> System.out.println(Arrays.toString(i)));


        String[] name = new  String[]{
                "akash", "ranjan", "I", "am", "singh", "Ram"
        };
        String[] filtered = Arrays.stream(name).filter(i-> i.length()>3).toArray(String[]::new);
        System.out.println(Arrays.toString(filtered));

        String akash = "aka3s9h";
        akash.chars().filter(i -> i >= 'a' && i <= 'z').forEach(i-> System.out.print((char) i));


    }
}
