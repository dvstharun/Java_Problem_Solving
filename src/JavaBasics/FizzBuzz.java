//A classic interview question. Iterate from 1 to 100 using a for loop.
// If the number is divisible by 3, print "Fizz". If it is divisible by 5,print "Buzz".
// If it is divisible by both 3 and 5, print "FizzBuzz".
// Otherwise, just print the number.
package JavaBasics;

public class FizzBuzz {
    public static void main(String[] args){
        for(int i=1; i<=100; i++){
            if((i%3==0) && (i%5==0)){
                System.out.println("FizzBuzz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
