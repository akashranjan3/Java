package akash.comparator.ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student(100, "amit", "chouhan");
        Student s2 = new Student(200, "Vijay", "kal");
        students.add(new Student(1,"Cakash","ranjan"));
        students.add(new Student(4,"An","verma"));
        students.add(new Student(5,"Shi","Singh"));
        students.add(new Student(3,"Vinay ranjan","ameer"));

        Iterator itr = students.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        Collections.sort(students,new Sortbyname());
        itr = students.iterator();
        System.out.println("----------------------------------------------------------");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }



}
