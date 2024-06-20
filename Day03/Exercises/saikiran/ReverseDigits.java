package Day03.Exercises.saikiran;

 public class ReverseDigits {
    public static void main(String[] args) {
        int number = 123; 
        int reversedNumber = 0;
        reversedNumber = (number % 10) * 100;    
        number /= 10;                           
        reversedNumber += (number % 10) * 10;    
        number /= 10;                           
        reversedNumber += number;               

        System.out.println("Reversed number: " + reversedNumber);
    }
}