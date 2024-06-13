package akash.exception.ex3;

public class InvalidStudent extends Exception {
    public InvalidStudent(String message) {
        super(message);
        System.out.println("invalid name hai be");
    }
}
