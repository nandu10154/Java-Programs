package Recursion;

public class SumofElements {
    public static int sum(int[] array, int i){
        if (i>= array.length){
            return i;
        }
        return sum(array,i+1)+array[i];
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(sum(arr,0));
    }
}
