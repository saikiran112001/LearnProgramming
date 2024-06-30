package Day06.Examples.saikiran;
import java.util.Scanner;
public class MixedCalculationWithAO {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("enter a number");
    int number=sc.nextInt();

    number+=10;
    number/=3;
    number%=5;
    number*=5;

    System.out.println("final result="+number);

    sc.close();
    }    
}
