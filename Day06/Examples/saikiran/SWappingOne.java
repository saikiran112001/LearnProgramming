package Day06.Examples.saikiran;
import java.util.Scanner;
public class SWappingOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enterr the value of x");
        int x=sc.nextInt();

        System.out.println("enter the value of y");
        int y=sc.nextInt();

        System.out.println("befor swapping");
        System.out.println("x="+x);
        System.out.println("y="+y);

        System.out.println("enter thr value of z");
        int z=sc.nextInt();

         z=x;
         x=y;
         y=z;

        System.out.println("after swapping");
        System.out.println("z="+x);
        System.out.println("x="+x);
        System.out.println("y="+y);

        sc.close();
    }
    
}
