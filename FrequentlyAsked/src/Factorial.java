public class Factorial {
    public static int fact(int n){
        if ((n==1) || (n==0 )){
            return 1;
        }else{
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            return fact;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
}
