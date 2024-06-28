package Day06.Examples.saikiran;
import java.util.Scanner;

public class MixedOp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter a number");
        int num=sc.nextInt();

        num+=10;
        num/=3;
        num%=5;
        num*=5;

        System.out.println("mixed op="+num);
        sc.close();
    }
    
}
