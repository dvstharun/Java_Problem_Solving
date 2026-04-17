package JavaBasics;

public class SumOfDigits {
    public static void main(String[] args){
        int n=384;
        int num = n;
        int sum = 0;
        while(num>0){
            int digit = num%10;
            sum += digit;
            num/=10;
        }
        System.out.println("Sum of digits in "+n+" is "+sum);
    }
}

