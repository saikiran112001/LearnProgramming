import java.util.Scanner;
public class PatterOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int i,j,n=1;

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