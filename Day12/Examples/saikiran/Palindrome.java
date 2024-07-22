package Day12.Examples.saikiran;

import java.util.Scanner;
public class Palindrome {
    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);

        System.out.println("enter string value");
        String s=sc.nextLine();
        String rev="";
        int i;
        for(i=s.length()-1;i>=0;i--){
           rev+=s.charAt(i);
           }

        if(rev.equals(s)){
            System.out.print("is palindrome");
        }
        else{
            System.out.print("not palindrome");
        }
        sc.close();
}
}

