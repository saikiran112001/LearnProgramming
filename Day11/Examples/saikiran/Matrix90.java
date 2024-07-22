package Day11.Examples.saikiran;

import java.util.Scanner;
public class Matrix90 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter n and m values");
        int n=sc.nextInt();
        int m=sc.nextInt();

        System.out.println("enter n1 and m1 values");
        int n1=sc.nextInt();
        int m1=sc.nextInt();

        int a[][]=new int[n][m];
        int i,j;

        System.out.println("enter a array values");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }

        int b[][]=new int[n1][m1];

        for(i=0;i<n1;i++){
            for(j=0;j<m1;j++){
                b[j][n1-i-1]=a[i][j];
            }
        }

        for(i=0;i<m1;i++){
            for(j=0;j<n1;j++){
                System.out.print(b[i][j]+  " ");
            }
        }

        System.out.println();

        sc.close();
    }
}










       

