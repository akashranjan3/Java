public class Operators {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        b = a++; //post increment
        System.out.println(a+": "+b);

        a = 10;
        b = 5;

        b = ++a; //pre increment
        System.out.println(a+": "+b);


        a += b; // a = a + b;
        a -=b; // a = a-b ;
        a *= b; // a = a*b
        a /= b; // a = a/b
    }
}