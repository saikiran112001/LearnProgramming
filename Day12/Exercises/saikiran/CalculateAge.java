package Day12.Exercises.saikiran;

import java.util.Scanner;
public class CalculateAge {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter birth year");
        int birth_Year=sc.nextInt();
       
        Operation c=new Operation();
       
        int age=c.MyAge(birth_Year);
        System.out.print(age);
    }
}
    


class Operation{
    public int MyAge(int birth_year){
        int current_year=2024;
        
        int age=current_year-birth_year;
        return age;
    }
}
