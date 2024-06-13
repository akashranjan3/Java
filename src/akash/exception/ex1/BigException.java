package akash.exception.ex1;

public class BigException extends Exception{
    public BigException(String invalidAge) {
        super(invalidAge);
        System.out.println("this is invalid age boss");
    }
}
