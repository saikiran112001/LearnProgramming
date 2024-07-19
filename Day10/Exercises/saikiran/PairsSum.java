package Day10.Exercises.saikiran;

import java.util.Scanner;
public class PairsSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("entr n value");
        int n=sc.nextInt();
        int i,j;
        int sum=7;
        int a[]=new int[n];

        System.out.println("enter  array values");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(a[i]+a[j]==sum){
                    System.out.print(a[i]+  +a[j]);
                }
            }
        }

    }
}
