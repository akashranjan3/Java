package akash.collection.list;
import java.util.Arrays;
import java.util.List;

public class Note {
    public static void main(String[] args) {
        String[] nameArray = {"akash", "ranjan", "Verma"};
        List<String> name = List.of(nameArray); // deep copy
        List<String> name2 = Arrays.asList(nameArray); // shallow copy
        nameArray[0] = "arpita";
        System.out.println(name);
        System.out.println(name2);


        /*
        Array list use dynamic array internally but Linked List uses dually linked list internally
        use array list if you need to read and retrieve the data,
        use linked list if you need to update and modify a lot.
        */
    }
}
