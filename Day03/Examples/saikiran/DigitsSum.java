package Day03.Examples.saikiran;

public class DigitsSum {
    public static void main(String[] args) {
        int n,first,second,third,sum;

        n=525;

        first=n/100;
        n=n%100;

        second=n/10;

        third=n%10;

        sum=first+second+third;

        System.out.println("sum of digits="+sum);
    }
}
