import java.io.BufferedReader;
import java.util.Scanner;

public class swapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swapping  value of a = "+a +" b =" +b);
        int temp =a;
        a= b;
        b = temp;
        System.out.println("After swapping value of a = "+a+" b = " +b);

    }
}
