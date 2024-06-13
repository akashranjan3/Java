package kunal.binarySearch;

public class BinarySearch {

    public static  boolean search(int[] a, int start, int end, int find){
        int mid = (start+end)/2;
        if(start>end){
            return false;
        }

        if(a[mid]<find){
            return search(a, mid+1, end, find);
        }else if(a[mid]>find){
            return search(a, start, mid-1, find);
        }else  if(a[mid]==find){
            return true;
        }
       return false;
    }
    public static  int nextGreaterNum(int[] a, int start, int end, int find){
        int mid = (start+end)/2;
        if(start>end){
            if(start>a.length-1)
                return a[0];
            return a[start];
        }

        if(a[mid]<find){
            return nextGreaterNum(a, mid+1, end, find);
        }else if(a[mid]>find){
            return nextGreaterNum(a, start, mid-1, find);
        }else  if(a[mid]==find){
            return a[mid];
        }
        return a[start];
    }

    public static void main(String[] args) {
        int[] arr = {1, 6 ,9, 10, 13, 18, 23, 34, 56, 78, 90, 99, 109, 112, 234, 890};

        System.out.println(nextGreaterNum(arr, 0 , arr.length-1 , 9090));
        System.out.println(search(arr, 0 , arr.length-1 , 7890));
    }
}
