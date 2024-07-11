import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the fibo number");
        int num=sc.nextInt();

        int a=0,b=1,n=10;
        System.out.print(a+" "+b+" ");
        
        for(int i=3;i<=num;i++)
        {
            int sum=a+b;
            System.out.print(sum +" ");
            a=b;
            b=sum;
        }
        System.out.println(num);
        sc.close();
        

    }
    
}
