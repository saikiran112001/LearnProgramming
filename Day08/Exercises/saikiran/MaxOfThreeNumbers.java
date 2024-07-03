package Day08.Exercises.saikiran;
import java.util.Scanner;
public class MaxOfThreeNumbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter first integer");
        int n1=sc.nextInt();

        System.out.println("enter second integer");
        int n2=sc.nextInt();

        System.out.println("enter third integer");
        int n3=sc.nextInt();

        if(n1>n2)
        {
         if(n1>n3)
         {
            System.out.println("first integer is maximum");
         }
         else
         {
            System.out.println("third integer is maximum");
         }
        }
         else if(n2>n3)
         {
            System.out.println("second integer is maximum");
         }
         else{
            System.out.println("third integer is maximum");
         }
        

        sc.close();

    }
}
    
    

