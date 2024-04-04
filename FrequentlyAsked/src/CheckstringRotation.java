public class CheckstringRotation {
    public static void main(String[] args) {
         String str1 =  "cloudtech";
         String str2 = "techcloud1";
        if(str1.length() != str2.length()){
            System.out.println("Str 2 is not rotation of str1");
        }
        else {
           str1 = str1+str2;
           if (str1.indexOf(str2)!=-1){
               System.out.println("str 2 is rotation of str 1");
           }else {
               System.out.println("Str 2 is not rotation of str1");
           }
        }
    }
}
