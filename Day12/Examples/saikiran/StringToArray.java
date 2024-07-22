package Day12.Examples.saikiran;

import java.util.Scanner;
public class StringToArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter string value");
        String s=sc.nextLine();
        char[] b=new char[s.length()];
        int i;

        for(i=0;i<s.length();i++){
            b[i]=s.charAt(i);
        }
        for(i=0;i<s.length();i++){
        System.out.print(b[i]);
        }
        sc.close();
            
    }    
}
