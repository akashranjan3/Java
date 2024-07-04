package akash.DynamicProgramming.Fibonacci;

public class Dp {

    public static int fibonacci(int n) {
        int[] num = new int[]{1, 1, 1};

        int ans = 1;
        if (n < 3) return 1;

        for (int i = 3; i <= n; i++) {
            num[i % 3] = num[(i + 1) % 3] + num[(i + 2) % 3];
            if (i == n)
                ans = num[i % 3];
        }
        return ans;

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
