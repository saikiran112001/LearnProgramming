package Day06.Examples.saikiran;
import java.util.Scanner;

public class TrianglePerimeter {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("enter the value of side1");
    int side1=sc.nextInt();

    System.out.println("enter the value of side 2");
    int side2=sc.nextInt();

    System.out.println("enter the value of side3");
    int side3=sc.nextInt();

    int perimeter=side1+side2+side3;

    System.out.println("triangle perimeter="+perimeter);    }
    
}
