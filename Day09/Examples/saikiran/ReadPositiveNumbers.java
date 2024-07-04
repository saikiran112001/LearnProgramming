package Day09.Examples.saikiran;

import java.util.Scanner;

public class ReadPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Enter positive numbers (enter a negative number to stop):");

        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

        if(number >= 0) 
        {
                System.out.println("You entered: " + number);
            }
        }
        while(number >= 0);
        {

        System.out.println("Negative number entered. Program ends.");
        }
        scanner.close();
    }
}

