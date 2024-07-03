package Day08.Exercises.saikiran;
import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter 5 subjects marks");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        int m4=sc.nextInt();
        int m5=sc.nextInt();

        int total=m1+m2+m3+m4+m5;

        if(total>=400)
        {
            System.out.println("grade is A");
        }
        else if(total>=300)
        {
            System.out.println("grade is B");
        }
        else if(total>=200)
        {
            System.out.println("grade is C");
        }
        else
        {
            System.out.println("student failed");
        }

        sc.close();
    }
    
}
