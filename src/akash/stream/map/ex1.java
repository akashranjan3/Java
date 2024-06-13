package akash.stream.map;

import java.util.*;
import java.util.stream.Collectors;

public class ex1 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("akash", "ranjan", "verma", "ram", "bahadur", "arjun", "amir");

        //map
        List<String> nameWithUpperCase = names.stream().map(i -> i.toUpperCase()).toList();
        System.out.println(nameWithUpperCase);

        //filter
        List<String> nameStartsWithA = names.stream().filter(i -> i.startsWith("a")).toList();
        System.out.println(nameStartsWithA);
        List<String> nameNotStartsWithA = names.stream()
                .filter(
                        i -> {
                            if (i.startsWith("a"))
                                return false;
                            return true;
                        }
                ).toList();
        System.out.println(nameNotStartsWithA);


        // collect
        List<Integer> num = Arrays.asList(1, 4, 2, 6, 7, 3, 6, 2, 9, 6, 9, 2);
        Map<Integer, Long> frequency = num.stream().collect(
                Collectors.groupingBy(
                        i -> i,
                        Collectors.counting()
                )
        );
        System.out.println(frequency);


        //reduce
        List<Integer> num1 = Arrays.asList(1, 4, 2, 3);
        int sum = num1.stream().reduce(0, (x, y) -> x + y);
        int biggestNum = num1.stream().reduce(0, (x, y) -> {
            if (x > y)
                return x;
            return y;
        });
        System.out.println(sum);
        System.out.println(biggestNum);

        //sort
        System.out.println(names.stream().sorted(Comparator.comparingInt(String::length)).toList());


        Map<String, Integer> map = new HashMap<>();
        map.put("akash", 8);
        map.put("ranjan", 18);
        map.put("akash ranjan verma", 18);
        map.put("akash ranjan", 18);
        map.put("verma", 2);
        map.put("Anurag", 13);
        map.put("singh", 6);

        System.out.println(

        map.entrySet().stream().sorted((i ,j)-> {
            if(i.getValue()!=j.getValue()){
                return i.getValue()-j.getValue();
            }
            return i.getKey().length()-j.getKey().length();
        }).toList()

        );

        LinkedHashMap<String, Integer> linkedList = new LinkedHashMap<>();
                 map.entrySet().stream().sorted((i ,j)-> {
            if(i.getValue()!=j.getValue()){
                return i.getValue()-j.getValue();
            }
            return i.getKey().length()-j.getKey().length();
        }).toList().forEach(i-> linkedList.put(i.getKey(), i.getValue()));
        System.out.println(linkedList);
        int[] nummm = {80, 8, 7, };
    }


}
