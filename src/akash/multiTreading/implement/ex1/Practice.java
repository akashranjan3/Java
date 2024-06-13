package akash.multiTreading.implement.ex1;

public class Practice {
    public static void main(String[] args) {
        System.out.println("rahim");
        for (int l = 0; l < 10; l++) {
            Thread thread = new Thread(new MytaskKro());
            System.out.println("ram");
            thread.start();
        }

        System.out.println("bolo");
        System.out.println("sir");
    }
}

class MytaskKro implements Runnable{

    @Override
    public void run() {
        if(Thread.currentThread().getId()%2 ==0){
            System.out.println(Thread.currentThread().getId() + " is sleeping for 1 sec");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        for (int i = 0; i < 10; i++) {

            System.out.println(Thread.currentThread().getId()+" - > num is: " + i);
        }
    }
}
