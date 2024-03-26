public class Gcd {
    public static int gcd(int a, int b){
        while(a!=b){
            if (a>b){
                a = a-b;
            }else{
                b = b-a;
            }
        }
        return a;
    }
    public static  int lcm(int a, int b){
        int lcm = a*b/gcd(a,b);
        return lcm;
    }

    public static void main(String[] args) {
        int a =20; int b = 15;
        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));
    }
}
