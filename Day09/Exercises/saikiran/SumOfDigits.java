import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter an integer");
        int num=sc.nextInt();

        int originalnumber=num;
        int reversednum=0;

        while(num!=0)
        {
            int digit=num%10;
            reversednum= reversednum*10+digit;
            num/=10;
        }

        System.out.println("reversed num of "+originalnumber+"is"+reversednum);

        sc.close();
    }    
}
