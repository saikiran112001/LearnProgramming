package Day10.Exercises.saikiran;

import java.util.Scanner;

public class PrintOddPositionTwo {
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);

            System.out.println("enter n value");
            int n=sc.nextInt();

            int a[]=new int[n];
            int i;

            System.out.println("enter array values");
            for(i=0;i<a.length;i++){
                a[i]=sc.nextInt();
            }

            for(i=1;i<a.length;i+=2)
            {
                System.out.print(a[i]);
            }
            
            sc.close();
           
}

}
