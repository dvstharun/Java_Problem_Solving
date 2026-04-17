//Temperature Converter: Write a program that declares a double variable for a temperature in Celsius.
// Use arithmetic operators to convert it to Fahrenheit ($F = (C \times \frac{9}{5}) + 32$) and print the result.
package JavaBasics;

public class TemperatureConverter {
    public static void main(String[] args){
        double Celsius=45;
        double Fahrenheit=0;
        Fahrenheit=(Celsius*9/5)+32;
        System.out.println(Celsius+" Caesius converted into "+Fahrenheit+" Fahrenheite");
    }
}
