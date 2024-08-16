package practice.o1;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Aksh", "Aelohi");
        Student s2 = new Student(1, "Cnurag", "Bra");
        Student s3 = new Student(1, "Cnurag", "CDelohi");


        Set<Student> students = new TreeSet<>(new CompareName());

        students.add(s1);
        students.add(s2);
        students.add(s3);
        System.out.println(students);

    }
}

class Student {
    private  int id;
    private  String name;
    private String location;

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Student(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }


}

class CompareLocation implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getLocation().compareTo(o2.getLocation());
    }
}
class CompareName implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class CompareId implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getId()-o2.getId();
    }
}
