import java.util.Scanner;
public class HCF {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter first number");
        int num_1=sc.nextInt();

        System.out.println("enter second number");
        int num_2=sc.nextInt();

        int a=num_1,b=num_2;

        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("hcf of"  + num_1+  "and" + num_2  +"is"+  a);
        sc.close();
    }
    
}
