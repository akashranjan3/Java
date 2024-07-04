package akash.DynamicProgramming.tailRecursion;

public class Recursion {
    public void head(int n) {

        System.out.println("calling the function n : " + n);

        if (n == 0) return;



        System.out.println("the value n : " + n);
        head(n - 1);
    }
}
