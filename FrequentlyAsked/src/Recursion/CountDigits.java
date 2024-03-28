package Recursion;

public class CountDigits {
    public static int count =0;
    public static int sum =0;
    public static int count(int n) {
        if (n == 0) {
            return 0;
        }else {
            return count(n/10)+1;
//1234
        }
    }
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }else {
            return sum(n/10)+n%10;
//1234
        }
    }
    public static int count2(int n){
        if (n == 0){
            return count;
        }else{
            count++;
            return count2(n/10);
        }
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(count(n));
        System.out.println(count2(n));
        System.out.println(sum(n));
    }
}
