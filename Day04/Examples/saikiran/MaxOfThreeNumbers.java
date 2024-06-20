package Day04.Examples.saikiran;

public class MaxOfThreeNumbers {
    public static void main(String args[]){
        int n1=5,n2=7,n3=3,max;

        System.out.println("first num="+n1);
        System.out.println("second num="+n2);
        System.out.println("third num="+n3);

        max = ((n1 > n2) ? (n1 > n3) ? n1 : n3 : (n2 > n3) ? n2 : n3);

        System.out.println("max number is="+max);
    }
}
