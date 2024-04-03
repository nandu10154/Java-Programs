package Arrays;

public class ReverseWords {
    public static String reverseword(String str){
        String words [] = str.split(" ");
        String reverse = "";
        for(int i =words.length-1;i>=0;i--){
            if(i==0){
                reverse = reverse + words[i];
            }else{
                reverse = reverse + words[i] + " ";
            }
        }
        return reverse;
    }

    public static void main(String[] args) {
        String str = "i will get job in this months";
        System.out.println(reverseword(str));
    }
}
