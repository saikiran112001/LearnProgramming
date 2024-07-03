package Day08.Examples.saikiran;
import java.util.Scanner;
public class PrintPositive {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number");
        int number=sc.nextInt();

        if(number>0)
        {
            System.out.println("print positive");
        }

        sc.close();
    }
    
}
