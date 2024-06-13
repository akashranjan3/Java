package akash.multiTreading.Durgesh.chatgpt;

class MyTry {
    private static final Object lock = new Object();
    private static boolean numberTurn = true;


    public static void main(String[] args) {
        Thread numbersThread = new Thread(new PrintNumbersAndZeros.PrintNumbers());
        Thread zeroThread = new Thread(new PrintNumbersAndZeros.PrintZero());


        numbersThread.start();
        zeroThread.start();
    }

    static class PrintNumbers implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
               synchronized (lock){
                   if(numberTurn){
                       System.out.println(i);
                       numberTurn = false;
                       lock.notify();
                   }else {
                       while (numberTurn==false){
                           try {
                               lock.wait();
                           } catch (InterruptedException e) {
                               throw new RuntimeException(e);
                           }
                       }
                   }
               }
            }
        }
    }

    static class PrintZero implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                synchronized (lock){
                    if(numberTurn==false){
                        System.out.println(0);
                        numberTurn = true;
                        lock.notify();
                    }else {
                        while (numberTurn==true){
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
        }
    }
}
}
