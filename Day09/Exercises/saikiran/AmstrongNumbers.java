import java.util.Scanner;
public class AmstrongNumbers {
    public static void main(String[] args){
        int i=1,a,sum,n;

        System.out.println("Armstrongnumber between 1 and 500");

        while(i<500)
        {
            n=i;
            sum=0;
            while(n>0)
            {
                a=n%10;
                sum=sum+(a*a*a);
                n=n/10;

            }
            if(sum==i)
            System.out.println(i);
            i++;
        }
    }    
}
