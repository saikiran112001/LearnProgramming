package Day10.Examples.saikiran;

import java.util.Scanner;
public class ReverseAraayTwo {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);

            int a[]=new int[5];
            int b[]=new int[5];
            int i,j;

            for(i=0;i<a.length;i++)
            {
                a[i]=sc.nextInt();
            }

            System.out.println("enter value of k");
            int k=sc.nextInt();
            j=k-1;

            for(i=0;i<k;i++)
            {
                b[i]=a[j];
                j--;
            }

            for(i=k;i<a.length;i++)
            {
                b[i]=a[i];
            }
            for(i=0;i<b.length;i++){
                System.out.print(b[i]);
             }
            sc.close();
        }    
}
