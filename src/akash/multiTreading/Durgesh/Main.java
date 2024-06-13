package akash.multiTreading.Durgesh;


public class Main {
    public static volatile boolean value = true;


    public static void main(String[] args) throws InterruptedException {
        Thread work = new Thread(new Work());
        Thread drink = new Thread(new Drink());

        work.start();
        work.wait();

/*
        System.out.println(" work.getId() " + work.getId());
        System.out.println("work.getName()"+ work.getName());
        System.out.println("drink.getName()"+ drink.getName());
        work.setName("atul");
        System.out.println("work.getName()"+ work.getName());
       */


//        work.join();
        if (value) {
            work.interrupt();
        }

        drink.start();


    }


}

class Work implements Runnable {
    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            if(Main.value) {
                System.out.println("Thread is working ");
//                Main.value = false;
//                notifyAll();
            }else {

            }
        }
    }
}


class Drink implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            if(Main.value) {
                System.out.println("Thread is drinking ");
//                Main.value = true;
//                notifyAll();
            }else {

            }

        }
    }
}

