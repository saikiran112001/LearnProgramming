package Day12.Exercises.saikiran;

import java.util.Scanner;

public class ArrayNew {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n=sc.nextInt();
        int a[]=new int[n];
        int count=0;
        while(true){
        System.out.println("Enter your choice: 1. Insert 2. Delete 3. Update 4. print all 5.exit ");
        System.out.println("enter your choice");
        int choice=sc.nextInt();
        // int count=0;
        
        if(choice==1){
            System.out.println("enter the value");
            int value=sc.nextInt();
            a[count]=value;
            count++;
        }
        
        if(choice==2){
            a[count-1]=0;
            count--;
        }

        if(choice==3){
            System.out.println("enter the index value");
            int index=sc.nextInt();
            System.out.println("enter the value");
            int value=sc.nextInt();
        if(index<count){
            a[index]=value;
        }
        else{
            System.out.println("\"check index value\"");
        }
        }

        if(choice==4){
            for(int i=0;i<count;i++){
                System.out.print(a[i]+"  ");
            }
            System.out.println();
        }

        if(choice==5){
            return;
        }
    }
}
}

