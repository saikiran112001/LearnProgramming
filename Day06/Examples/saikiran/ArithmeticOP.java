package Day06.Examples.saikiran;
import java.util.Scanner;
public class ArithmeticOP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of x");
        int a=sc.nextInt();

        System.out.println("enter the value of y");
        int b=sc.nextInt();

        int add= a+b;
        int sub= a-b;
        int mul= a*b;
        int div= a/b;
        int mod= a%b;

        System.out.println("a+b="+add);
        System.out.println("a-b="+sub);
        System.out.println("a*&b="+mul);
        System.out.println("a/b="+div);
        System.out.println("a%b="+mod);

        sc.close();
        }
    
}
