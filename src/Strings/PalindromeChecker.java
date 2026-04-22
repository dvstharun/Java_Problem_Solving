package Strings;

public class PalindromeChecker {
    public static void main(String[] args){
        String str = "wow";
        String rev_str = "";
        for(int i=str.length()-1; i>=0; i--){
            rev_str+=str.charAt(i);
        }
        if(str.equals(rev_str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not");
        }
    }
}
