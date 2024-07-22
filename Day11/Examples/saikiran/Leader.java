package Day11.Examples.saikiran;

import java.util.Scanner;
public class Leader {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter n value");
        int n=sc.nextInt();
        int i,j;
        int a[]=new int[n];

        System.out.println("enter a arary values");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        for(i=0;i<n;i++){
            boolean is_leader=true;
            for(j=i+1;j<n;j++){
            if(a[i]<=a[j]){
                is_leader=false;
                break;
            }
        }

        if(is_leader){
            System.out.print(a[i]+"  ");
        }
            
        
    
    } 
    sc.close();   
}
}
