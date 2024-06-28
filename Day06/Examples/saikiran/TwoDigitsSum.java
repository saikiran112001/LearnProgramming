package Day06.Examples.saikiran;
import java.util.Scanner;
public class TwoDigitsSum {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);

    System.out.println("enter a number");
    int num=sc.nextInt();

    int first_digit=(num/1000);
    double second_digit=(num/10);
    double third_digit=(second_digit%10);

    double sum=(first_digit+third_digit);

    System.out.println("two digit sum="+sum);

    sc.close();



    
}
}
