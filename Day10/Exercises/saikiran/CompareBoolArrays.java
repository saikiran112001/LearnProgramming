package Day10.Exercises.saikiran;

import java.util.Scanner;

public class CompareBoolArrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter n value");
        int n=sc.nextInt();

        System.out.println("enter m value");
        int m=sc.nextInt();

        if(n!=m){
            System.out.print("both boolean array are not same");
            
        }
        int i;

        boolean a[]=new boolean[n];
        boolean b[]=new boolean[m];

        System.out.println("enter n array values");

        for(i=0;i<n;i++){
            a[i]=sc.nextBoolean();
        }
        System.out.println("enter m array values");

        for(i=0;i<m;i++){
            b[i]=sc.nextBoolean();
        }

        for(i=0;i<n;i++){
            if(a[i]!=b[i]){
                System.out.print("both array are not some");
            }
        }
        System.out.print("both array are same");
        sc.close();
    }   
}


