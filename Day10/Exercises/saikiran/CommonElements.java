package Day10.Exercises.saikiran;

import java.util.Scanner;
public class CommonElements {
    public static void main(String args[] ){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter value of n1");
        int n1=sc.nextInt();

        System.out.println("enter value of n2");
        int n2=sc.nextInt();
        
        int i,j;

        int a[] = new int[n1];
        int b[] = new int[n2];

        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(j=0;j<b.length;j++)
        {
            b[j]=sc.nextInt();
        }

        for(i=0;i<a.length;i++)
        {
        for(j=0;j<b.length;j++)
        {
        if(a[i]==b[j])
        {
            System.out.println("commen element found="+a[i]);
            
        }
         
        }
        }
            System.out.print("commen elements not found");
            sc.close();
}
}


