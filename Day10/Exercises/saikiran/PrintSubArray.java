package Day10.Exercises.saikiran;

import java.util.Scanner;
public class PrintSubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter n value");
        int n=sc.nextInt();

        int i;
        int a[]=new int[n];

        System.out.println("enter array values");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("enter start value");
        int start=sc.nextInt();

        System.out.println("enter end value");
        int end=sc.nextInt();

        for(i=start;i<end;i++)
        {
            System.out.println("sub array is:"+a[i]);
        }


    }    
}
