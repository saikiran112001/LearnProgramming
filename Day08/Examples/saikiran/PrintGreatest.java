package Day08.Examples.saikiran;
import java.util.Scanner;
public class PrintGreatest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter first number");
        int num1=sc.nextInt();

        System.out.println("enter second number");
        int num2=sc.nextInt();

        System.out.println("enter third number");
        int num3=sc.nextInt();

        if(num1 > num2){
            if(num1 > num3)
            System.out.print("The greatest: " + num1);
            else if(num2 > num3)
            System.out.print("The greatest: " + num2);
            else
            System.out.print("The greatest: " + num3);
        }
        else if(num2 > num3)
        System.out.print("The greatest: " + num2);
        else
        System.out.print("The greatest: " + num3);

        sc.close();




    }
    
}
