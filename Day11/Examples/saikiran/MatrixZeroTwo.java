package Day11.Examples.saikiran;

import java.util.Scanner;
public class MatrixZeroTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter n values");
        int n=sc.nextInt();

        int a[][]=new int[n][n];
        int i,j;

        System.out.println("enter a array values");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }

        }

        for(i=0;i<n;i++){
            a[0][i]=0;
        }
        for(i=0;i<n;i++){
            a[n-1][i]=0;
        }
        for(i=0;i<n;i++){
            a[i][0]=0;
        }
        for(i=0;i<n;i++){
            a[i][n-1]=0;
        }

        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
            a[0][i]=0;
            a[n-1][i]=0;
            a[i][0]=0;
            a[i][n-1]=0;
        {
        System.out.print(a[i][j]+ " ");

        }
        
}
System.out.println();
}
    }
}
