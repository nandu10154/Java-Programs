package Recursion;

public class Reverse {
    public static String reverse(String str,String r,int i){
        if(i<0){
            return r;
        }
        return reverse(str,r+str.charAt(i),i-1);
    }
    public static boolean palindrome(String str, int i,int j){
        if(str.charAt(i) != str.charAt(j)){
            return false;
        }
        if(i>=j){
            return true;
        }
        return palindrome(str,i+1,j-1);
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(reverse(str,"",str.length()-1));
        System.out.println(palindrome(str,0,str.length()-1));
    }
}
