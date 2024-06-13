package akash.comparator.ex2;

import java.util.Comparator;

public class Student{
    int roll;
    String name;
    String surName;

    public Student(int roll, String name, String surName) {
        this.roll = roll;
        this.name = name;
        this.surName = surName;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public int roll() {
        return roll;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }


    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }





}

class Sortbyname implements Comparator<Student> {


    public int compare(Student a, Student b)
    {

        return a.getName().length()-b.getName().length();
    }
}
