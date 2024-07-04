package akash.DynamicProgramming.Bit;

public class Main {
    public  static  int countBits(int n){
        int counter= 0 ;
        while (n>0){
            counter++;
            n = n>>1;
        }
        return counter;
    }

    public static  boolean isEven(int n ){
        if((n & 1) == 1) return  false;
        return  true;
    }




    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(1024));
        System.out.println(Integer.toBinaryString(12));

        System.out.println(countBits(1024));
        System.out.println(countBits(12));

        System.out.println(isEven(61024));
        System.out.println(isEven(6121));
        System.out.println(isEven(7));
        System.out.println(isEven(11));
        System.out.println(isEven(14));
    }
}
