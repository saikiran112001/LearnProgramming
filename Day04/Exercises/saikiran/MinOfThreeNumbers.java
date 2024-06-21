package Day04.Exercises.saikiran;

public class MinOfThreeNumbers {
    public static void main(String[] args) {
        int n1=5,n2=7,n3=3,min;

        System.out.println("first number="+n1);
        System.out.println("second number="+n2);
        System.out.println("third number="+n3);

        min=(n1<n2?(n1<n3)?n1:n3:(n2<n3)?n2:n3);

        System.out.println("min number is="+min);
    }
}
