public class reverseNumber {
    public static int reverse(int n){
        int rev = 0;
        while(n>0){
            rev = rev*10+n%10;
            n = n/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int n = 4321;
        int rev = reverse(n);
        System.out.println("The original number is " +n);
        System.out.println("The reverse of a Number is "+rev);
    }
}
