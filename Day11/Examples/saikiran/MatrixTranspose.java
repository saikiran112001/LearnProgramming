package Day11.Examples.saikiran;

import java.util.Scanner;
public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter value of n");
        int n=sc.nextInt();

        int a[][]=new int[n][n];
        int i,j;

        System.out.println("enter a array values");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }

        int transpose[][]=new int[n][n];

        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
               transpose[i][j]=a[j][i];
            }
        }

        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(transpose[i][j]+ "  ");
            }
            System.out.println();
        }



        
    }
}
