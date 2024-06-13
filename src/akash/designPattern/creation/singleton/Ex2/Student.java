package akash.designPattern.creation.singleton.Ex2;

public class Student {
    private static Student student = new Student();

    private Student() {
    }

    public static Student getInstance() {
        return student;
    }
/*
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", DOB='" + DOB + '\'' +
                '}';
    }*/
}
