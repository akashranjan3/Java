package practice;

import java.util.Arrays;
import java.util.stream.Stream;

public class MissingNumber {

    public static void main(String[] args) {
        int[] ques = {1, 2, 4,5};
//       /**/ Arrays.stream(ques).forEach(i-> System.out.println(i));

       /* boolean[] booleans = new boolean[2];
        for (Boolean b :
                booleans) {
            System.out.println("boolean vakue for this is : " + b );

        }*/


        System.out.println(findMissingNum(ques.length + 1, ques));
        System.out.println(bySum(ques.length + 1, ques));

    }
    public  static int findMissingNum(int n, int[] input){
        boolean[] temp = new boolean[n];
        for(int i = 0; i < n-1; i++) {
         temp[input[i]-1] = true;
        }
        for (int i = 0; i < n; i++) {
            if(temp[i]==false)
                return i+1;
        }
//        Arrays.stream(temp)
        return 0;

    }
 public  static int bySum(int n, int[] input){
       int sum = 0;
     for (int i = 0; i < input.length; i++) {
         sum += input[i];
     }
     System.out.println("sum : "+ sum);
     return ((n*(n+1))/2) - sum;

    }

}
