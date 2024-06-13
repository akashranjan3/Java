package akash.exception.ex4;

public class Test {

    public static void main(String[] args) {
        String name = "@akash Ranjan Verma";

        try {
            validate(name);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void validate(String name) throws InvalidLanguage {
        if (name.startsWith("@")) {
            throw new InvalidLanguage("Invalid syntax");
        }
    }

}

class InvalidLanguage extends RuntimeException {

    public InvalidLanguage(String message) {
        super(message);
    }
}
