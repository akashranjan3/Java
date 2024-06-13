package prac;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String name = "Akash ranjan Verma ";
        Map<Character, Integer> myCount = new TreeMap<>();
        for(int i = 0; i< name.length(); i++){
            System.out.println(name.charAt(i));
            if(myCount.containsKey(name.charAt(i))){
                myCount.put(name.charAt(i), myCount.get(name.charAt(i)) + 1 );
            }else{
                myCount.put(name.charAt(i), 1);
            }
        }
        System.out.println(myCount.entrySet());
        System.out.println(myCount.keySet());
        System.out.println(myCount.values());

        Iterator it = myCount.entrySet().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
