package Day03.Exercises.saikiran;

public class CelsiusConvert {
    public static void main(String[] args) {
       
        double fahrenheit = 70.0;
        
        double celsius = (fahrenheit - 32) * 5 / 9;
        
        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");
    }
}