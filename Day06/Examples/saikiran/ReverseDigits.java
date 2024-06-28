package Day06.Examples.saikiran;
import java.util.Scanner;
public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number");
        int number=sc.nextInt();

        int reversedNumber = 0;
        reversedNumber = (number % 10) * 100;    
        number /= 10;                           
        reversedNumber += (number % 10) * 10;    
        number /= 10;                           
        reversedNumber += number;               

        System.out.println("Reversed number: " + reversedNumber);

        sc.close();
    }
    
}
