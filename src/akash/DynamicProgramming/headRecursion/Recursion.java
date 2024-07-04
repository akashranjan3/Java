package akash.DynamicProgramming.headRecursion;

public class Recursion {
    public void head(int n) {

        System.out.println("calling the function n : " + n);

        if (n == 0) return;

        head(n - 1);

        System.out.println("the value n : " + n);
    }
}
