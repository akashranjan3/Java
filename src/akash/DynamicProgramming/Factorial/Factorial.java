package akash.DynamicProgramming.Factorial;

public class Factorial {

    public int calculate(int n) {

        if (n == 1) return 1;

        return calculate(n - 1) * n;
    }
}
