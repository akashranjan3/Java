package akash.exception.ex2;

class CustomException extends Exception {
    public CustomException(String s) {
        super(s);
        System.out.println("jo bolo aap");
    }
}


class myException {
    public static void validate(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("you are not 18+");
        } else {
            System.out.println("welcome");
        }
    }

    public static void main(String[] args) {
        int age = 12;
        try {
            validate(age);
        } catch (CustomException e) {
            System.out.println("Exception caught -> "+e);
        }finally {
            System.out.println("super boss");
        }
        System.out.println("yes sir");
    }
}