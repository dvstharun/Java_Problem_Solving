package Strings;

public class ReverseString {
    public static void main(String[] args){
        String str = "Tharun";
        String rev_str = "";
        for(int i=str.length()-1; i>=0; i--){
            rev_str+=str.charAt(i);
        }
        System.out.println(rev_str);
    }
}
