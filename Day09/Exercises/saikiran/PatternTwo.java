import java.util.Scanner;
public class PatternTwo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter n value");
        int n=sc.nextInt();
        int i,j;

        for(j=1;j<=n;j++)
        {
        for(i=1;i<=j;i++)
        {
            System.out.print("*");
            
        }
        System.out.println();
        }
      
       sc.close();
    
    }
}
    

