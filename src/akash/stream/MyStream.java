package akash.stream;

import akash.comparator.ex2.Student;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class MyStream {
    Student s1 = new Student(1, "akash", "ranajn ");

    public static void main(String args[]) {

        List<String> name1 = Arrays.asList("Akash Ranjan ", "Anam Kumar ", "ro", "kumar", "Vijay malya", "Mahendra", "singht", "dhoni");

        List<Integer> listSome = List.of(8, 9, 7, 5, 2, 66);
        List<String> bignames = name1.stream().filter(i -> (i.length() > 5)).toList();
        List<String> name1Short = name1.stream().sorted().toList();
        List<String> startsWithA = name1.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
        List<String> lowerCase = name1.stream().map(i -> i.toLowerCase()).collect(Collectors.toList());
        List<String> min = name1.stream().min((o1, o2) -> o1.length() - o2.length()).stream().collect(Collectors.toList());
        List<String> min2 = name1.stream().min(Comparator.comparingInt(String::length)).stream().collect(Collectors.toList());
        List<String> min3 = name1.stream().min(Comparator.reverseOrder()).stream().collect(Collectors.toList());
        System.out.println("min get-> " + name1.stream().min(Comparator.naturalOrder()).get());
        System.out.println("min-> " + min);
        System.out.println("min3-> " + min3);
//        List<String> lowerCase1 = name1.stream().filter(i -> (i.length() > 5)).reduce()

        System.out.println("bignames-> " + bignames);
        System.out.println("name1Short-> " + name1Short);
        System.out.println("startsWithA=>" + startsWithA);
        System.out.println("lowerCase=>" + lowerCase);


        // create a list of integers
        List<Integer> number = Arrays.asList(2, 3, 4, 5);

        // demonstration of map method
        List<Integer> square
                = number.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());

        System.out.println(square);
        // create a list of integers
        List<Integer> numbers
                = Arrays.asList(2, 3, 4, 5, 2);

        // collect method returns a set
        Set<Integer> squareSet
                = numbers.stream()
                .map(x -> x * x)
                .collect(Collectors.toSet());

        System.out.println(squareSet);

        // demonstration of forEach method
        number.stream()
                .map(x -> x * x)
                .forEach(y -> System.out.print(" " + y));
        System.out.println();

        // demonstration of reduce method
        int even
                = number.stream()
                .filter(x -> x % 2 == 0)
                .reduce(100, (ans, i) -> ans + i + i);

        System.out.println("even: " + even);

        System.out.println("=================================== Comparator ====================================================");

        Map<Integer, Integer> map = new HashMap<>();
        map.put(2, 9);
        map.put(7, 9);
        map.put(8, 97);
        map.put(12, 94);
        map.put(6, 93);
        map.put(9, 19);
        map.put(100, 1);
        map.put(120, 1);
        map.put(110, 1);
        map.put(111, 1);
        map.put(98, 3);
        System.out.println(map);

        Map<Integer, Integer> tree = new LinkedHashMap<>();
        List<Integer> listX = new LinkedList<>();
        map.entrySet().stream().sorted((o1, o2) -> {
            int i = o2.getValue() - o1.getValue();
            if (i == 0) {
                i = o1.getKey() - o2.getKey();
            }
            return i;
        }).forEach(pass -> {
            for (int i = 1; i <= pass.getValue(); i++) {
                listX.add(pass.getKey());
            }
        });
        System.out.println(listX);

        List<Integer> listY = Arrays.asList(2, 7, 95, 3, 6, 3, 1, 75, 63, 94, 75, 2, 4, 2, 4, 2, 3, 100);


        System.out.println("=================================== Occurrence ====================================================");

        List<Integer> listM = Arrays.asList(8, 9, 3, 8, 4, 5, 1, 9, 4, 3, 2, 2, 2, 6, 2, 9);
        Map<Integer, Long> map2 = listM.stream().collect(
                Collectors.groupingBy(
                        e -> e,
                        Collectors.counting()
                )
        );
        System.out.println(map2);

        List<String> name9 = Arrays.asList("Akash ranjan ", "Anam Kumar ", "Akash Ranjan ",
                "Anam Kumar ", "Akash Ranjan ", "Anam Kumar ", "Akash Ranjan ",
                "Anam Kumar ", "Akash Ranjan ", "Anam Kumar ", "ro", "Anam Kumar ",
                "ro", "Anam Kumar ", "ro", "kumar", "Vijay malya", "Mahendra", "singht", "dhoni");
        Map<String, Long> map9 = name9.stream().collect(
                Collectors.groupingBy(
                        e -> e,
                        Collectors.counting()
                )
        );
        System.out.println(map9);

        List<Student> litsStu = Arrays.asList(
                new Student(1, "akash", "ranajn "),
                new Student(3, "bs", "sdv "),
                new Student(2, "wdc", "wd "),
                new Student(3, "asd", "dd "),
                new Student(1, "q", "ff "),
                new Student(1, "q", "ff "),
                new Student(1, "qt", "ff "),
                new Student(1, "dq", "ff "),
                new Student(1, "qr", "ff "),
                new Student(1, "aq", "ff ")
        );

        Map<Object, Long> map90 = litsStu.stream().collect(Collectors.groupingBy(
                i -> i.getSurName(),
                Collectors.counting()
        ));
        System.out.println(map90);


        System.out.println("------------------------------------------------------------------------------");

        List<Integer> listHH = Arrays.asList(3, 8, 3, 4, 7, 2, 2);

        System.out.println(listHH.stream().filter(i -> Collections.frequency(listHH, i) == 1).reduce(0, (a, b) -> a + b));
//        System.out.println(listHH.stream().filter(i-> i>1).sum());

        int a = listHH.stream().collect(Collectors.groupingBy(
                i -> i,
                Collectors.counting()
        )).entrySet().stream().filter(i -> i.getValue() == 1).map(i -> i.getKey()).reduce(0, (x, y) -> x + y);

        System.out.println("my a is : " + a);


        List<Integer> fun = Arrays.asList(2, 8, 9, 5, 7, 3, 9, 90, 8, 3, 2, 7);
//fun.stream().
//        fun.int

        int listNN =
                fun.stream().collect(Collectors.groupingBy(
                        i -> i,
                        Collectors.counting()
                )).entrySet().stream().filter(i -> i.getValue() == 2).collect(Collectors.toList()).stream().map(i -> i.getKey()).reduce(0, (x, y) -> x + y);
        System.out.println(listNN);

//

        System.out.println(LocalDateTime.now());
    }


}
