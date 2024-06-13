package akash.comparator.ex3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Employee> Employees = new TreeSet<>(new CompareByRole());
        Employees.add(new Employee(1, "akash", "tester"));
        Employees.add(new Employee(2, "akash ranjan verma", "awa"));
        Employees.add(new Employee(3, "akash ranjan", "sd"));
        Employees.add(new Employee(4, "akash rv", "music"));
        System.out.println(Employees);
    }
}

class CompareByName implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().length()-o2.getName().length();
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
class CompareById implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getId()-o2.getId();
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
class CompareByRole implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getJobRole().compareTo(o2.getJobRole());
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
