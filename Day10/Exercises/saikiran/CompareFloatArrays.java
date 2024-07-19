package Day10.Exercises.saikiran;

import java.util.Scanner;
public class CompareFloatArrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter n value");
        int n=sc.nextInt();

        System.out.println("enter m value");
        int m=sc.nextInt();

        if(n!=m){
            System.out.print("both array are not same");
            return;
        }
        int i;

        float a[]=new float[n];
        float b[]=new float[m];

        System.out.println("enter  n array values");

        for(i=0;i<n;i++){
            a[i]=sc.nextFloat();
        }

        System.out.println("enter  m array values");


        for(i=0;i<n;i++){
            b[i]=sc.nextFloat();
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
