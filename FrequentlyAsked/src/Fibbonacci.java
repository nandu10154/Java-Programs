public class Fibbonacci {
    public static void fib(int n){
        int first =0;
        int second =1;
        System.out.println(first);
        System.out.println(second);
        for(int i =2;i<n;i++){

            int temp = first;
            first = second;
            second = temp +second;
            System.out.println(second);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        fib(n);
    }
}
