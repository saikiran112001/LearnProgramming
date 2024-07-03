package Day08.Examples.saikiran;
import java.util.Scanner;
public class PrintPositiveOrNegetive {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number");
        int num=sc.nextInt();

        if(num>0)
        {
            System.out.println("number is positive");
        }

        else if(num<0)
        {
            System.out.println("number is negative");
        }

        sc.close();
    }
    
}
