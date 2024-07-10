import java.util.Scanner;
public class AmstrongNumbers {
    public static void main(String[] args){
        int i=1,a,arm,n;

        System.out.println("Armstrongnumber between 1 and 500");

        while(i<500)
        {
            n=i;
            arm=0;
            while(n>0)
            {
                a=n%10;
                arm=arm+(a*a*a);
                n=n/10;

            }
            if(arm==i)
            System.out.println(i);
            i++;
        }
    }    
}
