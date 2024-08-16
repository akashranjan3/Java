package practice.o2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupByStream {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "akash", 200);
        Employee e2 = new Employee(2, "ranjan", 600);
        Employee e3 = new Employee(2, "vishal", 600);
        Employee e4 = new Employee(2, "ram", 200);
        Employee e5 = new Employee(2, "Mukesh", 7000);
        Employee e6 = new Employee(2, "Raja", 200);

        List<Employee> employees = Arrays.asList(e1, e2, e3, e4, e5 ,e6);

        employees.stream().collect(Collectors.groupingBy(Employee::getSalary)).forEach((key, value) -> System.out.println("Employees with salary "+key + " are ->  " + value));


    }

}

class Employee {
    private int id;
    private  String name;
    private int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int s) {
        this.salary = s;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}