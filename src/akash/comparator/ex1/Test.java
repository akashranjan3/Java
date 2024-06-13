package akash.comparator.ex1;

import java.util.*;

public class Test {
    public static Comparator<Employyee> name = Comparator.comparing(Employyee::getName);
    public static Comparator<Employyee> role = Comparator.comparing(Employyee::getRole);
    public static Comparator<Employyee> id = Comparator.comparingInt(Employyee::getId);

    public static Comparator<Employyee> secontChar = Comparator.comparingInt(o -> o.getName().charAt(1));
    public static Comparator<Employyee> secontAndFirstChar = new Comparator<Employyee>() {
        @Override
        public int compare(Employyee o1, Employyee o2) {
            if(o1.getName().charAt(1)==o2.getName().charAt(1))
                return o1.getName().charAt(1)-o2.getName().charAt(1);
            return o1.getName().charAt(0)-o2.getName().charAt(0);
        }
    };


    public static void main(String[] args) {
        Set<Employyee> set = new TreeSet<>(
                Comparator.comparing(Employyee::getName)
        );
        set.add(new Employyee(1, "bkah","bc"));
        set.add(new Employyee(1, "akah","bcn"));
        set.add(new Employyee(1, "dv","bc"));
        set.add(new Employyee(1, "ka","bc"));
        set.add(new Employyee(1, "ck","bc"));
        set.forEach(i-> System.out.println(i.toString()));

        System.out.println(" ________________________________________________________________");

        Set<Employyee> set2 = new TreeSet<>(secontChar);
        set2.add(new Employyee(1, "akah","bc"));
        set2.add(new Employyee(1, "akah","bcn"));
        set2.add(new Employyee(1, "dv","bc"));
        set2.add(new Employyee(1, "ka","bc"));
        set2.add(new Employyee(1, "ak","bc"));
        set2.add(new Employyee(1, "az","bc"));
        set2.forEach(i-> System.out.println(i));
        System.out.println(" ___________________jjj_____________________________________________");

        Set<Employyee> set3 = new TreeSet<>();
        set3.add(new Employyee(1, "akah","bc"));
        set3.add(new Employyee(1, "akah","bcn"));
        set3.add(new Employyee(1, "dv","bc"));
        set3.add(new Employyee(1, "ka","bc"));
        set3.add(new Employyee(1, "ak","bc"));
        set3.forEach(i-> System.out.println(i));

        System.out.println(new Employyee(1, "akah","bc").equals(new Employyee(1, "akah","bcn")));

        System.out.println(new Employyee(1, "akah","bcn").hashCode());
        System.out.println(new Employyee(1, "g","gg").hashCode());


        String s = "akbsh";
        String sm = new String("alash");

        System.out.println(s.hashCode());
        System.out.println(sm.hashCode());
        System.out.println(sm.equals(s));

        Map<Integer,Integer> some = new HashMap<>();
        some.put(1, 6 );
        if(some.containsKey(1)){

        }

    }
}
