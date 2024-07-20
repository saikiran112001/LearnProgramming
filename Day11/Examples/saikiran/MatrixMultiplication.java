package Day11.Examples.saikiran;

import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter n and m values");
        int n=sc.nextInt();
        int m=sc.nextInt();

        System.out.println("enter n1 and m1 values");
        int n1=sc.nextInt();
        int m1=sc.nextInt();

        int a[][]=new int[n][m];
        int b[][]=new int[n1][m1];

        if(n!=m1){
            System.out.print("matrix size not same cant be multiplied");
            return;
        }
    
        int i,j,k;

        System.out.println("enter a array values");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("enter b array values");
        for(i=0;i<n1;i++){
            for(j=0;j<m1;j++){
                b[i][j]=sc.nextInt();
            }
        }

        
        int sum[][]=new int[m][n1];

        for(i=0;i<n;i++){
        for(j=0;j<m1;j++){
        for(k=0;k<n1;k++){
            sum[i][j]+=a[i][k]*b[k][j];
                }
            }
        }

        for(i=0;i<n;i++){
        for(j=0;j<m1;j++){
            System.out.print(sum[i][j]+ " ");
        }

            System.out.println();
    }

}
}

    
    

