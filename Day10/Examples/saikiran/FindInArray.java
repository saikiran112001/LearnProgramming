package Day10.Examples.saikiran;

import java.util.Scanner;
public class FindInArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int i;
        boolean present=false;

        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("enter the number u want to check");
        int num=sc.nextInt();

        for(i=0;i<a.length;i++)
        {
            if(a[i]==num);
            present=true;

            System.out.print(present);
        }
        sc.close();
    }

    
}
