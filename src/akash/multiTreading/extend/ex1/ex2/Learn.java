package akash.multiTreading.extend.ex1.ex2;

public class Learn {
    public static void main(String[] args) {
        System.out.println("boss");
        Thread thread = new Thread(new MyWork());
        thread.start();
        System.out.println("done");
    }
}
class MyWork extends Thread{
    @Override
    public void run() {
        for(int i = 0 ; i<10; i++){
            System.out.println("moye moye" + i);
        }
    }
}
