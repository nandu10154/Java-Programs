package Recursion;

public class NaturalNumbers {
    public static void Natural(int n){
        if (n<=0){
            return ;
        }else{
            Natural(n-1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        Natural(n);
    }
}
