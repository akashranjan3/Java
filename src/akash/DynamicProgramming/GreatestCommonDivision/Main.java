package akash.DynamicProgramming.GreatestCommonDivision;

public class Main {
    public static int GDC(int a, int b) {
        int remainder = Math.max(a, b) % Math.min(a, b);
        if (remainder == 0) {
            return Math.min(a, b);
        }else{
            return GDC(remainder, Math.min(a, b));
        }


    }


    public static void main(String[] args) {
        System.out.println(GDC(35, 10));
    }
}
