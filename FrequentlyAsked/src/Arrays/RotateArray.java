package Arrays;

public class RotateArray {
    public static void rotate(int[] array, int rotateBy) {
        int length = array.length;
        int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            int index = (i + rotateBy) % length;
            temp[i] = array[index];
        }
        for (int i = 0; i < length; i++) {
            array[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        rotate(nums, 2);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
