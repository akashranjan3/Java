package practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> sample = Arrays.asList(2, 5, 5, 5, 4, 5, 6, 2, 3, 4, 3, 100, 900);

//        LinkedList<Integer, Long> linkedList = sample.stream().collect(
//                Collectors.groupingBy(i-> i,
//                        Collectors.counting())
//        ).entrySet().stream().sorted((i, j)-> {
//            if(i.getValue()==j.getValue())
//                return (int) (i.getValue() - j.getValue());
//            else
//                return i.getKey()-j.getKey();
//        }).toList();

        LinkedHashMap<Integer, Long> linkedList = new LinkedHashMap<>();


        sample.stream().collect(
                Collectors.groupingBy(i-> i,
                        Collectors.counting())
        ).entrySet().stream().sorted((i, j)-> {
            if(i.getValue()!=j.getValue())
                return (int) (i.getValue() - j.getValue());
            else
                return i.getKey()-j.getKey();
        }).forEach(i-> linkedList.put(i.getKey(), i.getValue()));
        System.out.println(linkedList);

        List<Character> ch = Arrays.asList('a','b','s','i','d');
        ch.stream().filter(i-> "aeiou".indexOf(i)==-1).forEach(i-> System.out.println(" .."+i+".."));
    }
}
