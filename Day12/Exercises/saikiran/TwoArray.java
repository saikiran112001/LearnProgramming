package Day12.Exercises.saikiran;

import java.util.Scanner;
public class TwoArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter n and m values");
        int n=sc.nextInt();
        int m=sc.nextInt();
        Array x=new Array();
        int a[][]=x.read2DArray(n,m,sc);
        x.print2DArray(a,n,m);
    }
    
}

class Array{
    public int[][] read2DArray(int n,int m,Scanner sc){
        int a[][]=new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        return a;
    }


public void print2DArray(int a[][],int n,int m){
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(a[i][j]+"   ");
        }
        System.out.println();
    }
}
}

