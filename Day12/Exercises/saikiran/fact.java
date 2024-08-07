package Day12.Exercises.saikiran;

import java.util.Scanner;
public class fact{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter factorial number");
        int n=sc.nextInt();

        Operation f=new Operation();
        int product=f.getFactorial(n);
        System.out.print(product+"  ");
    }
}

class Operation{
    public int getFactorial(int n){

        int product=1;
        for(int i=1;i<=n;i++){
            product*=i;
        }
        return product;
    }
}

