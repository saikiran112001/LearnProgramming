import java.util.Scanner;
public class HCF {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter first number");
        int a=sc.nextInt();

        System.out.println("enter second number");
        int b=sc.nextInt();

        int hcf=0,i=1;

        for(i=1;i<=b;i++)
        {
        if(a%i==0 && b%i==0)
        {
        hcf=i;
        }
        }

        System.out.println("hcf="+hcf);
    }
}


        
      
