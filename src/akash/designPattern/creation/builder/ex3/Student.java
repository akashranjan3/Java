package akash.designPattern.creation.builder.ex3;

public class Student {
    private String name;
    private  String DOB;
    private String location;
    private  String marks;

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return  this;
    }

    public String getDOB() {
        return DOB;
    }

    public Student setDOB(String DOB) {
        this.DOB = DOB;
        return  this;

    }

    public String getLocation() {
        return location;
    }

    public Student setLocation(String location) {
        this.location = location;
        return  this;

    }

    public String getMarks() {
        return marks;
    }

    public Student setMarks(String marks) {
        this.marks = marks;
        return  this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", DOB='" + DOB + '\'' +
                ", location='" + location + '\'' +
                ", marks='" + marks + '\'' +
                '}';
    }
}
