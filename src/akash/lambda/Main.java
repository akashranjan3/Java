package akash.lambda;
class Student{
    int id;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        st.id = 9;
        st.name = "Akash";

//        if else
        int i  = st.id<10?10:5;

        System.out.println(i );

        System.out.println(st.toString());
    }
}
