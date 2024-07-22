package Day11.Examples.saikiran;

import java.util.Scanner;

public class UpperTraingle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter n  and m value");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        int b[][]=new int[n][m];
        int i,j;

        System.out.println("enter a array values");
        for(i=0;i<n;i++){
        for(j=0;j<m;j++){
            a[i][j]=sc.nextInt();
            }
        }

        for(i=0;i<n;i++){
            for(j=m-1;j>=0;j--){
                if(i<=j){
                    System.out.print(b[i][j]=a[i][j]  );
                }
                else{
                    System.out.print(b[i][j]=0);
                }
            }
            System.out.println();
        }

    }
}



