package JavaBasics;

public class Reverse_Num {
    public static void main(String[] args){
        int num = 2345;
        int rev_num=0;
        while(num>0){
            int digit=num%10;
            rev_num=rev_num*10+digit;
            num=num/10;

        }
        System.out.println(rev_num);
    }
}
