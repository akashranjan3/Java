package akash.DynamicProgramming.Fibonacci;

public class Recursion {

    public static int fibonacci(int n) {
        if (n == 1) return 1;
        if (n == 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);


    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        System.out.println(fibonacci(10));
        System.out.println(fibonacci(30));
        System.out.println(fibonacci(40));

        long endTime = System.nanoTime();
        long executionTime
                = (endTime - startTime) / 1000000;

        System.out.println("took "
                + executionTime + "ms");

    }
}

