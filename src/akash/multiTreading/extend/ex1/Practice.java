package akash.multiTreading.extend.ex1;

public class Practice {
    public static void main(String[] args) {

        System.out.println("rahim");
        Thread myTask = new Thread(new MyTask());
        System.out.println("ram");
        myTask.start();

        System.out.println("bolo");
        System.out.println("sir");
    }
}

class MyTask extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("num : " + i);
        }
    }
}