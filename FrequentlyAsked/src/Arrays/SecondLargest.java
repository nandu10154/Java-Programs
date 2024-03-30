package Arrays;

public class SecondLargest {
    public static int large(int[] arry){
        int max1= arry[0];
        int max2 = arry[1];
        for(int i =2;i<arry.length;i++){
            if(arry[i]>max1){
                max2 = max1;
                max1 = arry[i];
            } else if (arry[i]>max2) {
                max2 = arry[i];

            }
        }
        return max2;

    }
    public static void main(String[] args) {
        int [] array = {98,1,2,3,4,5,6,7,8,99,97};
        System.out.println(large(array));
    }
}
