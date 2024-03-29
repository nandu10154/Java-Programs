public class SumofDigits {
    public static int sum(int n){
        int sum = 0;
        int count =0;
        while(n>0){
            int rem = n%10;
            sum = sum + rem;
            n = n /10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 1002;
        System.out.println(sum(n));
    }
}
