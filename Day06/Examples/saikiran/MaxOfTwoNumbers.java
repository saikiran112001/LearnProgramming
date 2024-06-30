package Day06.Examples.saikiran;
import java.util.Scanner;
public class MaxOfTwoNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter first number");
        int n1=sc.nextInt();

        System.out.println("enter second_number");
        int n2=sc.nextInt();

        int max=(n1>n2)?n1:n2;

        System.out.println("maximum is="+max);

        sc.close();
    }
    
}
