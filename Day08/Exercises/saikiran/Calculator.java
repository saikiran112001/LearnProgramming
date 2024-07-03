package Day08.Exercises.saikiran;
import java.util.Scanner;
public class Calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a value");
        int a=sc.nextInt();

        System.out.println("enter b value");
        int b=sc.nextInt();

        System.out.println("1.addition");
        System.out.println("2.substraction");
        System.out.println("3.multiplication");
        System.out.println("4.division");
        System.out.println("5.exit");

        System.out.println("enter your choice");
        int ch=sc.nextInt();

        if(ch==1)
        {
        System.out.print(a+b);
        }
        else if(ch==2)
        {
            System.out.println(a-b);
        }
        else if(ch==3)
        {
            System.out.println(a*b);
        }
        else if(ch==4)
        {
            System.out.println(a/b);
        }
        else if(ch==5)
        {
            System.out.println("exit");
        }

        sc.close();

    }
    
    
}   

    
    

