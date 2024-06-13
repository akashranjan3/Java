public class Main {
    public static void main(String[] args) {
        int[] myMarks = new int[10];
        int hisMarks[] = new int[10];
        int ourmarks[] = {1, 8 , 9 , 89, 82, 77, 23, 78};
        myMarks[0] =90;
      for (int i = 0 ;i<myMarks.length; i++){
          System.out.println(myMarks[i]);
      }

      for(int i : myMarks){
          System.out.println("my marks "+ i);
      }


      int[] a = {1, 3, 6, 8, 90};
      for(int i : a){
          System.out.println(i);
      }

      int[][] myArr = new int[3][5];//int[row][column]


    }
}