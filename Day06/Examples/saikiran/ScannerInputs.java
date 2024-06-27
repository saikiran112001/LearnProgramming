package Day06.Examples.saikiran;
import java.util.Scanner;

public class ScannerInputs {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);

    System.out.println("enter an integer");
    int int1=sc.nextInt();
    System.out.println("enter an integer:"+int1);

    System.out.println("enter a float");
    float float1=sc.nextFloat();
    System.out.println("enter a float:"+float1);

    System.out.println("enter a boolean");
    boolean boolean1=sc.nextBoolean();
    System.out.println("enter a boolean:"+boolean1);

    System.out.print("Enter your name: ");
    String Line = sc.nextLine();
    System.out.println("enter your name" +Line);

    System.out.print("Enter your name: ");
    String Word = sc.next();
    System.out.println("enter your name: " + Word);
    
    System.out.println("enter a byte:");
    byte byte1=sc.nextByte();
    System.out.println("enter a byte:"+byte1);

    System.out.println("enter a double");
    double double1=sc.nextDouble();
    System.out.println("enter a double"+double1);

    System.out.println("enter a short");
    short short1=sc.nextShort();
    System.out.println("enter a short"+short1);

    System.out.println("enter a long");
    long long1=sc.nextLong();
    System.out.println("enter a long:"+long1);
    
         

    sc.close();

    
}
}
