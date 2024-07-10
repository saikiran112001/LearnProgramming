import java.util.Scanner;
public class FindLargeSmallNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number");
        int number=sc.nextInt();
    

        int largest=0;
        int smallest=0;

        if(number>largest)
        {
            largest=number;
        }
       else if(number<smallest)
        {
            smallest=number;
        }

        System.out.println("largest number="+largest);
        System.out.println("smallest number="+smallest);

        sc.close();
}
}
