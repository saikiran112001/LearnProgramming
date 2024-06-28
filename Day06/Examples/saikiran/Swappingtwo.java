package Day06.Examples.saikiran;
import java.util.Scanner;
public class Swappingtwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of x");
        int x=sc.nextInt();

        System.out.println("entr the the value of y");
        int y=sc.nextInt();

        System.out.println("before swapping");
        System.out.println("x="+x);
        System.out.println("y="+y);
        
        y=y-x;
        x=y+x;
        y=-(y-x);

        System.out.println("after swapping");
        System.out.println("x="+x);
        System.out.println("y="+y);

        sc.close();
    }

}
