package Day09.Examples.saikiran;

import java.util.Scanner;
public class patternThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter value of n");
        int n=sc.nextInt();
        
        for (int i = 1; i <= n; i++) 
        {
            for (int j = n; j > i; j--) 
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}