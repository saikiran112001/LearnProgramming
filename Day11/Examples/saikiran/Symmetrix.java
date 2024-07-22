package Day11.Examples.saikiran;

import java.util.Scanner;
public class Symmetrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter n value");
        int n=sc.nextInt();

        int a[][]=new int[n][n];
        int i,j;

        System.out.println("enter a array values");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }

        boolean symmetrix=true;

        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(a[i][j]!=a[j][i]){
                    symmetrix=false;
                    break;
                }
            }
            if(!symmetrix){
                break;
            }
        }
            if(symmetrix){
                System.out.print("given array is symmetrix");
            }
            else{
                System.out.print("given array is not symmetrix");
            }
            sc.close();
                }
            }
    
