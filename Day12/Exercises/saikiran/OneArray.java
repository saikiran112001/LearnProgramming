package Day12.Exercises.saikiran;

import java.util.Scanner;

public class OneArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter n value");
        int n=sc.nextInt();
        Array x=new Array();
        int a[]=x.read1DArray(n,sc);
        x.print1DArray(a,n);
    }
    
}

class Array{
    public int[] read1DArray(int n,Scanner sc){
        int a[]=new int[n];
        
        for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            return a;
    
        }
        
    


public void print1DArray(int a[],int n){
    for(int i=0;i<n;i++){
        System.out.print(a[i]+"   ");
        }
        System.out.println();
    }
}




