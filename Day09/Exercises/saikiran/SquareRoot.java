import java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int i=1;
        while(i<=100)
        {
            if(i*i>=100)
            break;
            System.out.println(i);
            i++;

        }
            sc.close();
    }
    
}
