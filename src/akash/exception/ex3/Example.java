package akash.exception.ex3;

public class Example {
    public static void main(String[] args) {
        System.out.println("start");
        int age = 20;
        try{
            validate(age);
        } catch (InvalidAge e) {
            throw new RuntimeException(e);
        }
    }
    public static void validate(int i ) throws InvalidAge{
        if(i<18){
            throw new InvalidAge("invalid age");
        }
        else {
            System.out.println("let him go...");
        }
    }
}
class InvalidAge extends RuntimeException{
    public InvalidAge(String message) {
        super(message);
    }
}
