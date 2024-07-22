package Day10.Exercises.saikiran;

import java.util.Scanner;
public class SecondLargest {
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

       int first_highest=Integer.MIN_VALUE;

       for(i=0;i<a.length;i++){
        if(first_highest<a[i]){
            first_highest=a[i];
        }
       }

       int second_highest=Integer.MIN_VALUE;

       for(i=0;i<a.length;i++){
        if(a[i]==first_highest){
            continue;}
         if(second_highest<a[i]){
            second_highest=a[i];
         }[]
        
       }
       System.out.print("2nd largest value is:"+second_highest);
       sc.close();
    }    
}
