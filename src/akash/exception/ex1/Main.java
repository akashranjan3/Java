package akash.exception.ex1;

public class Main {
    public static void main(String[] args) throws BigException {
        int age = -10;
        try{
            checkage(age);
        }catch (Exception e){
            System.out.println("caught -> " + e);
        }


    }

    public static void checkage (int age) throws BigException {
        if(age<0){
            throw new BigException("invalid age");
        }
        if(age<18){
            System.out.println("do not let him enter");
        }else {
            System.out.println("let him enter");
        }
    }


}