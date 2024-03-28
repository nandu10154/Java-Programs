public class PrimeFactors {
    public static void factors(int n){
        int i = 2;
        while(i*i<=n){
            if (n%i == 0){
                System.out.println(i);
                n = n/i;
            }
            i++;

        }
        if(n>1){
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        factors(n);
    }
}
