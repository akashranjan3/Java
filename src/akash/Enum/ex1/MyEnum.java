package akash.Enum.ex1;
import java.util.LinkedList;
import java.util.List;



public class MyEnum {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "akash", Profile.HR);
        Employee employee2 = new Employee(2, "ranjan", Profile.DEVELOPER);
        Employee employee3 = new Employee(3, "rajesh", Profile.MANAGER);
        Employee employee4 = new Employee(4, "Mohan", Profile.DEVELOPER);

        List<Employee> list = new LinkedList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);

        System.out.println("my enum is ----> ");
        System.out.println(list);
    }
}

enum Profile {
    HR,
    DEVELOPER,
    MANAGER

}

class Employee {
    private int id;
    private String name;
    private Profile role;

    public Employee() {
    }

    public Employee(int id, String name, Profile role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

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

    public Profile getRole() {
        return role;
    }

    public void setRole(Profile role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role=" + role +
                '}';
    }
}