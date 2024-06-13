package akash.designPattern.creation.singleton.Ex1;


class Main{
    public static void main(String[] args) {
        Abc abc = Abc.getInstance();
        Abc abc2 = Abc.getInstance();
        System.out.println(abc2.hashCode());
        System.out.println(abc.hashCode());

    }
}
