package akash.designPattern.creation.builder.ex3;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        student.setDOB("19/10/1999").setLocation("Lucknow").setMarks("562").setName("akash");
        System.out.println(student);
        student.setMarks("7").setName("rahul");
        System.out.println(student);
    }
}
