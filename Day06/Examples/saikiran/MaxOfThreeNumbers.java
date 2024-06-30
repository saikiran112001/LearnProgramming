package Day06.Examples.saikiran;
import java.util.Scanner;
public class MaxOfThreeNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter first number");
        int n1=sc.nextInt();

        System.out.println("enter second number");
        int n2=sc.nextInt();

        System.out.println("enter third number");
        int n3=sc.nextInt();

        int max=(n1>n2)?(n1>n3)?n1:n3:(n2>n3)?n2:n3;

        System.out.println("maximum number is="+max);

        sc.close();
    
    }
    
}
