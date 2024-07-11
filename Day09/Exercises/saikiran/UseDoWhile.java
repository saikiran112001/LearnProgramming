import java.util.Scanner;
public class UseDoWhile {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        boolean choice;

        do
        {
            System.out.println("enter two numbers");
            int num1=sc.nextInt();
            int num2=sc.nextInt();

            int sum=num1+num2;
            System.out.println("sum of two numbers="+sum);

            System.out.println("do u want to continue: (0 for yes/1 for no):");
            sc.nextLine();
            choice=sc.nextBoolean();
        }
        while(choice);
        sc.close();
        
    }    
}
