package dump;

public class Strings {

    public static void main(String[] args) {
        String name1 = "akash";
        String name2 = "akash";
        if (name1.equals(name2)) {
            System.out.println("equal");
        }
//learn parsing
StringBuilder name3 = new StringBuilder("ranjan");
        name3.setCharAt(0,'M');
        System.out.println(name3 );
        name3.insert(0,"mr ");
         name3.delete(1,3);
        System.out.println(name3 );
    }
}