package akash.designPattern.creation.singleton.Ex2;

public class Test {
    public static void main(String[] args) {
        Student student = Student.getInstance();
        Student student2 = Student.getInstance();


        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());

    }
}
