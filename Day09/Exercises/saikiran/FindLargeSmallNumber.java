import java.util.Scanner;
public class FindLargeSmallNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a  n series of numbers");
        int n=sc.nextInt();
        int i;
    

        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MIN_VALUE;

        for(i=1;i<=n;i++)
        {
        if(n>largest){
            largest=n;
        }
        if(n<smallest){
            smallest=n;
        }
        }
    

        System.out.println("largest number="+largest);
        System.out.println("smallest number="+smallest);

        sc.close();

        
}
}
