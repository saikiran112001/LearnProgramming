package Day10.Exercises.saikiran;

import java.util.Scanner;
public class SecondSmallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter n value");
        int n=sc.nextInt();

        int a[]=new int[n];
        int i;

        System.out.println("enter value of n");

        for(i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

       int first_smallest=Integer.MAX_VALUE;

       for(i=0;i<a.length;i++){
        if(first_smallest>a[i]){
            first_smallest=a[i];
        }
       }

       int second_smallest=Integer.MAX_VALUE;

       for(i=0;i<a.length;i++){
        if(a[i]==first_smallest){
            continue;}
         if(second_smallest>a[i]){
            second_smallest=a[i];
         }
        
       }
       System.out.print("2nd smallest value is:"+second_smallest);
       sc.close();
    }    
}


