import java.util.Scanner;

public class ReverseDigits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter an integer");
        int num=sc.nextInt();

        int reversednumber=0;

        while(num!=0){
            int digit=num%10;
            reversednumber=reversednumber*10+digit;
            num/=10;
        }

        System.out.println("reversed number="+reversednumber);

        sc.close();
    }
}
