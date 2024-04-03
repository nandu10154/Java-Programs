public class ConvertUpperLower {
    public static StringBuffer convert(StringBuffer str){
        for(int i =0;i<str.length();i++){
            char c = str.charAt(i);
            if(c==Character.toLowerCase(c)){
                Character uppercase = (char) (c - 32);
//                str.setCharAt(i,Character.toUpperCase(c));
                str.setCharAt(i,uppercase);
            }else {
                Character lowercase = (char)(c+32);
                str.setCharAt(i,lowercase);
//                str.setCharAt(i,Character.toLowerCase(c));
            }
        }
        return str;
    }
    public static void main(String args[]){
        StringBuffer stringBuffer = new StringBuffer("NaNdU");
        System.out.println(convert(stringBuffer));
    }
}
