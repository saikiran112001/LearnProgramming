import java.util.Scanner;
public class PrimeOrNot{


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an positive integer");
        
        int num = sc.nextInt();

        boolean is_prime=num>1;

        for(int i=1;i*i<=num;i++)
        if(num % i==0)
        {
            is_prime=true;
            break;
        }
    
        System.out.println(num +(is_prime? " is a prime number." : " is not a prime number."));

        
    

    sc.close();
    }

}



