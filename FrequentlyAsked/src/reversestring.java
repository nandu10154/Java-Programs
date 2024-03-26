public class reversestring {
    public static String reverse(String str){
        String rev = "";
        for(int i =str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            rev = rev + ch;
        }
        return rev;
    }

    public static void main(String[] args) {
        String str = "nandu";
        String rev = reverse(str);
        System.out.println(rev);
    }
}
