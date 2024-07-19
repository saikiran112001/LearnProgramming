package Day10.Examples.saikiran;

import java.util.Scanner;
public class ReverseArray {

    public static void main(String array[]){
        Scanner sc=new Scanner(System.in);

        int a[]=new int[5];
        int b[]=new int[5];
        int i,j;
        

        for(i=0;i<a.length;i++)
        {
            
            a[i]=sc.nextInt();
        }
        
        i=b.length-1;
        
        for(j=0;j<b.length;j++)
        {
            
            b[j]=a[i];
            i--;
            
         }
         for(i=0;i<b.length;i++){
            System.out.print(b[i]);
         }
        sc.close();
        

        
    }
    
}
