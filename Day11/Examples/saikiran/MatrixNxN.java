package Day11.Examples.saikiran;

import java.util.Scanner;
public class MatrixNxN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n value");
        int n = sc.nextInt();

        int[][] a = new int[n][n];

        System.out.println("Enter the array values:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int i, j;
            for (i = 0; i < n; i++){
                for (j = 0; j < n; j++){
                    System.out.print(a[i][j]   +"   ");
                }
                System.out.println();
            }
}
}
