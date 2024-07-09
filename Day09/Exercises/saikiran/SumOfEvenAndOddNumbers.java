import java.util.Scanner;

public class SumOfEvenAndOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumEven = 0;
        int sumOdd = 0;
        char choice = 'y';

        while (Character.toLowerCase(choice) == 'y') {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();

            sumEven += (num % 2 == 0) ? num : 0;
            sumOdd += (num % 2 != 0) ? num : 0;

            System.out.print("Do you want to continue? (y/n): ");
            choice = scanner.next().charAt(0);
        }

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);

        scanner.close();
    }
}
