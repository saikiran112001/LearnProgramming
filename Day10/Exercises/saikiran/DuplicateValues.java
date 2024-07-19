package Day10.Exercises.saikiran;

import java.util.Scanner;
public class DuplicateValues {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);

            System.out.println("enter n numbers");
            int n=sc.nextInt();

            int a[]=new int[n];
            int i,j;

            for(i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            for(i=0;i<n;i++)
            {
            for(j=i+1;j<n;j++)
                {
                    if(a[i]==a[j])
                    {
                        System.out.println("if dulicate found"+a[i]);
                        return;
                    }
                }
            }
            
            System.out.print("duplicate not found");
            sc.close();
        }   
}
