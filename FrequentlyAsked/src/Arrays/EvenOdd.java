package Arrays;

public class EvenOdd {
    public static void evnodd(int[] array){
        int even [] = new int[array.length];
        int index = 0;
        for(int i =0;i<array.length;i++)
        {
            if (array[i]%2 == 0){
                even[index] = array[i];
                index++;
            }

        }
        for(int i =0;i<array.length;i++)
        {
            if (array[i]%2 != 0){
                even[index] = array[i];
                index++;
            }

        }
       for (int i =0;i<even.length;i++){
           System.out.println(even[i]);
       }

    }

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        evnodd(array);
    }
}
