package Day11.Examples.saikiran;

import java.util.Scanner;
public class MatrixSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter value of n");
        int n=sc.nextInt();

        int a[][]=Read2DArray(n, sc);
        int b[][]=Read2DArray(n, sc);
        int i,j;

        // System.out.println("enter a matrix values");
        // for(i=0;i<n;i++){
        //     for(j=0;j<n;j++){
        //     a[i][j]=sc.nextInt();
        //     }
        // }

        // System.out.println("enter b matrix values");
        // for(i=0;i<n;i++){
        // for(j=0;j<n;j++){
        //     b[i][j]=sc.nextInt();
        // }
        // }

        int sum[][]=new int[n][n];

        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("sum of a nd b matrix:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(sum[i][j]+ "  ");
            }
            System.out.println();
        }

       
        sc.close();

    }    

    public static int[][] Read2DArray(int n, Scanner sc){
        int tmp[][]= new int[n][n];
        System.out.println("enter a matrix values");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            tmp[i][j]=sc.nextInt();
            }
        }

        return tmp;
    }
}
