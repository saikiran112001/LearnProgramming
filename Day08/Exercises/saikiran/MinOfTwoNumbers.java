package Day08.Exercises.saikiran;
import java.util.Scanner;
public class MinOfTwoNumbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in); 
        
        System.out.println("enter first integer");
        int n1=sc.nextInt();

        System.out.println("enter second integer");
        int n2=sc.nextInt();

        if(n1<n2)
        {
            System.out.println("1st integer is minimum");
        }
        else
        {
            System.out.println("second integer is minimum");
        }

        sc.close();
    
    }
    
}
