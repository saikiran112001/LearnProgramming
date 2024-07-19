package Day10.Exercises.saikiran;

import java.util.Scanner;
public class SplitArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter value of n");
        int n=sc.nextInt();

        int i;
        int a[]=new int[n];
        int b[]=new int[n/2];
        int c[]=new int[n-n/2];

        System.out.println("enter n values");
        for(i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        int j=0;
        for(i=0;i<b.length;i++){
            b[i]=a[j];
            j++;
        }

        for(i=0;i<c.length;i++){
            c[i]=a[j];
            j++;
        }

        for(i=0;i<b.length;i++){
            System.out.println("split array 1="+b[i]);
        }

        for(i=0;i<c.length;i++){
            System.out.println("split array 2="+c[i]);
        }

        sc.close();


    }    
}
