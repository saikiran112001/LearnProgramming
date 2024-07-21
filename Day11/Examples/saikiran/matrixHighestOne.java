package Day11.Examples.saikiran;
import java.util.Scanner;
public class matrixHighestOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter n  and m value");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        int i,j;

        System.out.println("enter a array values");
        for(i=0;i<n;i++){
        for(j=0;j<m;j++){
            a[i][j]=sc.nextInt();
            }
        }

       //int highest=Integer.MIN_VALUE;

       for(i=0;i<n;i++){
        int highest=Integer.MIN_VALUE;
           for(j=0;j<m;j++){
            //int highest=Integer.MIN_VALUE;
             if(highest<a[i][j]){
                highest=a[i][j];
                }
             }
            System.out.print("highest value is:"+highest+ " ");
            System.out.println();
       }
       sc.close();
        }
    }
       
       

      


