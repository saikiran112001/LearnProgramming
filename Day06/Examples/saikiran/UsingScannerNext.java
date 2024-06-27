package Day06.Examples.saikiran;
import java.util.Scanner;

public class UsingScannerNext{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
     
System.out.print("Enter your first name and last name: ");
String firstName = sc.next();
System.out.println("First Name : " + firstName);
String lastName = sc.next();
System.out.println("Last Name : " + lastName);

    sc.close();
     }
}

