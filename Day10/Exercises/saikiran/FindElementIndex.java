package Day10.Exercises.saikiran;

import java.util.Scanner;
public class FindElementIndex {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter value of n");
        int n=sc.nextInt();

        int a[]=new int[n];
        int i;

        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("enter a new number");
        int number=sc.nextInt();

        for(i=0;i<a.length;i++)
        {
            if(a[i]==number){
            System.out.println("index of given number="+i);
            return;
            }
        }
        System.out.println(-1);
        sc.close();
    }
    
}
