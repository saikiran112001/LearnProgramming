package Day06.Examples.saikiran;
import java.util.Scanner;

public class MarksCalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter three subjects marks");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();

        int total_marks=m1+m2+m3;
        double percentage=(total_marks/3.0);

        System.out.println("total_marks="+total_marks);
        System.out.println("percentage="+percentage+"%");

        sc.close();
    }
    
}
