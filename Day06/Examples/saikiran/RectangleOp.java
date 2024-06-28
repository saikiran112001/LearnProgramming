package Day06.Examples.saikiran;
import java.util.Scanner;
public class RectangleOp {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of length");
        int length=sc.nextInt();

        System.out.println("enter the value of beadth");
        int breadth=sc.nextInt();

        int area=length+breadth;
        int perimeter=2*(length+breadth);

        System.out.println("area of rectangle="+area);
        System.out.println("perimeter of rectangle"+perimeter);

        sc.close();


    }
    
}
