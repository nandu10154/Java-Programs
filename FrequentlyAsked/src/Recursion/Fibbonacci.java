package Recursion;

public class Fibbonacci {
    public static int fib(int n){
        if(n<=1){
            return n;
        }else{
            return fib(n-1)+fib(n-2);

        }
    }

    public static void main(String[] args) {
        int n = 3;
        for(int i =0;i<n;i++){
            System.out.println(fib(i));
        }
    }
}
