package Day12.Examples.saikiran;

import java.util.Scanner;
public class StringEven {
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        
        System.out.println("enter string value");
        String s=sc.nextLine();
        
        String b[]=s.split(" ");
   
        System.out.println("before:");
        for(int i=0;i<=b.length-1;i++){
       System.out.println(b[i]+"-"+b[i].length());
        }    
        System.out.println("after:");
         for(int i=0;i<=b.length-1;i++){
                if( b[i].length()%2!=0){
                   continue;
                   }
               else{
                    System.out.println(b[i]);
               }
        
        }
        sc.close();
}
}


