package akash.multiTreading.implement.ex1.ex2;

public class Learn {
    public static void main(String[] args) {
        System.out.println("yes sir");
        Thread thread = new Thread(new DoStuff());
        thread.start();
        System.out.println("done");
    }
}
class DoStuff implements Runnable{

    @Override
    public void run() {
        for(int i = 0 ; i < 10; i++){
            System.out.println(" ye hai "+ i);
        }
    }
}