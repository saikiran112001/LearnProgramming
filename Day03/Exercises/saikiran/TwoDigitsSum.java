package Day03.Exercises.saikiran;

public class TwoDigitsSum {
    public static void main(String[] args) {
        int num=12345;
        int first_digit=(num/1000);
        double second_digit=(num/10);
        double third_digit=(second_digit%10);

        double sum=(first_digit+third_digit);

        System.out.println("two digit sum="+sum);
    }
    
}
