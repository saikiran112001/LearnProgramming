import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the fibo number");
        int num=sc.nextInt();

        System.out.print("fibo series of %d terms");
        int a=0,b=1;

        System.out.println(a+" "+b+" ");
        for(int i=2;i<num;i++)
        {
            int next=a+b;
            System.out.println(next +" ");
            a=b;
            b=num;
        }
        System.out.println();
        sc.close();
        

    }
    
}
