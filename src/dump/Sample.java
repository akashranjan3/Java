package dump;

import java.util.HashMap;
import java.util.Map;

public class Sample {


    public static void main(String[] args) {

       int[] arr = {1,3,5,7,2,1,5,3,3};
       // expected 3,3,3,1,1,5,5,7,2


        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                int temp = map.get(arr[i])+ 1;
                map.put(arr[i], temp);
            }else{
                map.put(arr[i], 1);
            }
        }
map.get(2);



        System.out.println();;

    }
}
