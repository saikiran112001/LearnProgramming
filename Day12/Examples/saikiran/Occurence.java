package Day12.Examples.saikiran;

import java.util.Scanner;
public class Occurence {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter string value");
        String s=sc.nextLine();
        int i,j;
        //char ch[]=new char[s.length()];

        for( i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                continue;
            }
        

        int count=1;
        for( j=i+1;j<s.length();j++){
            if(s.charAt(i)==s.charAt(j)){
                count+=1;
            }
        }

        System.out.printf("occurence of %c is: %d\n",s.charAt(i),count);
        s = s.replace(s.charAt(i),' ');
    }

    }    
}
