package staticNonStatic;
 class Sugar{
    int a , b ;
    public Sugar(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Sugar{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
    void swap(){
        int temp = a;
        a= b;
        b= temp;

    }
    void add(){
        a++;b++;
    }
}



public class Main {







    public static void main(String[] args) {
       Sugar s = new Sugar(10, 20);

        System.out.println(s);
     s.swap();
        System.out.println(s);
        s.add();// add(s);
        System.out.println(s);
    }
}
