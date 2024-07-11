import java.util.Scanner;
public class HCF {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter first number");
        int a=sc.nextInt();

        System.out.println("enter second number");
        int b=sc.nextInt();

        
        while(true)
        {
           int remainder=a%b;
        
            if(remainder==0)
            {
                System.out.println(b);
                break;
                
            } 
            a=b;
            b=remainder;

        }
        sc.close();
        

}

}
