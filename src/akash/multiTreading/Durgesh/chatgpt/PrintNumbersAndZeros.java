package akash.multiTreading.Durgesh.chatgpt;

class PrintNumbersAndZeros {
    private static final Object lock = new Object();
    private static boolean numberTurn = true;


    public static void main(String[] args) {
        Thread numbersThread = new Thread(new PrintNumbers());
        Thread zeroThread = new Thread(new PrintZero());


        numbersThread.start();
        zeroThread.start();
    }

    static class PrintNumbers implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                synchronized (lock) {
                    while (!numberTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.print(i + " ");
                    numberTurn = false;
                    lock.notify();
                }
            }
        }
    }

    static class PrintZero implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                synchronized (lock) {
                    while (numberTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.println("0");
                    numberTurn = true;
                    lock.notify();
                }
            }
        }
    }
}
