package akash.exception.ex3;

public class Main {
    public static void main(String[] args) {
        Student[] mySchool = {new Student(1, "akash"), new Student(2, "R"), new Student(3, "babita")};
     /*   try {
            printStudent(mySchool);
        } catch (InvalidStudent e) {
            System.out.println("please check the exception");
        }*/
        try{
            printStudent(mySchool);
        } catch (InvalidStudent e) {
            throw new RuntimeException(e);
        }

        System.out.println("Bolo sir");
    }

    private static void printStudent(Student[] mySchool) throws InvalidStudent{
        for(int i = 0 ; i< mySchool.length; i++){
            if(mySchool[i].getName().length()<2)
                throw new InvalidStudent("shortname");
        
            System.out.println(mySchool[i]);
        }
    }
}
