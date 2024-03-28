package Arrays;

public class RotateArray2 {
    public static void swap(int [] array,int start,int end){
        while(start<end){
            int tenp = array[start];
            array[start] = array[end];
            array[end] = tenp;
            start++;
            end--;
        }
    }
    public static void rotate(int array[],int k){
        k = k%array.length;
        swap(array,0, array.length-1);
        swap(array,0,k-1);
        swap(array,k,array.length-1);
    }

    public static void main(String[] args) {
        int array [] = {1,2,3,4,5};
        rotate(array,2);
        for (int arr :array){
            System.out.println(arr);
        }
    }
}
