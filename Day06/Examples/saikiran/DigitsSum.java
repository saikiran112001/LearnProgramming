package Day06.Examples.saikiran;
import java.util.Scanner;
public class DigitsSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a 3 digit number");
        int num=sc.nextInt();

        int first=num/100;
        int second=(num/10)%10;
        int third=num%10;

        int sum=first+second+third;

        System.out.println("sum of 3 digits is"+sum);

        sc.close();
    }
    
}
