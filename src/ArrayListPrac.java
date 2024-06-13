import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPrac {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(9);
        list.add(6);
        list.add(4);
        System.out.println(list);
        list.add(1, 77);
        System.out.println(list);
        list.set(0, 55);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println(list.size());

        Collections.sort(list);
        System.out.println(list);
//        list.addAll(3,5,77,99,90);
    }
}