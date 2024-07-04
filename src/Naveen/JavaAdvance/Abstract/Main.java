package Naveen.JavaAdvance.Abstract;

interface Face {
    void sing(int i);
}

abstract class A {
    public abstract void run();
}


public class Main {
    public static void main(String[] args) {
        A objectA = new A() {
            public void run() {
                System.out.println("I am running boss");
            }
        };
        objectA.run();


        Face face = new Face() {
            @Override
            public void sing(int i) {
                System.out.println("I am singing ");
            }
        };
        Face face2 = new Face() {
            @Override
            public void sing(int i) {
                System.out.println("I am singing ");
            }
        };
//    by lambda
        Face f2 = (x) -> System.out.println("I am singing " + x + " times ");
        f2.sing(3);

    }
}

