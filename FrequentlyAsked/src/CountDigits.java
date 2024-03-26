public class CountDigits {
    public static int count(int n){
        int count = 0;
        while(n>0){
            count = count + 1;
            n = n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 123456;
        System.out.println(count(n));
    }
}
