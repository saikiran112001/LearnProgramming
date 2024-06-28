package Day06.Examples.saikiran;
import java.util.Scanner;
public class Celsius {
    public static void main(String args[] ){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of fahrenheit");
        double fahrenheit=sc.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        
        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");

        sc.close();
    
    }
    
}
