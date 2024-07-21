package Day11.Examples.saikiran;

import java.util.Scanner;
public class SortingOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter n value");
        int n=sc.nextInt();

        int a[]=new int[n];
        int i;

        System.out.println("enter a array values");
        for(i=0;i<n;i++){
            
            a[i]=sc.nextInt();
        }

        boolean sorted=true;
    }    
}
