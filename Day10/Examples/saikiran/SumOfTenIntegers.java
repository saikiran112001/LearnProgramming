package Day10.Examples.saikiran;


public class SumOfTenIntegers {
    public static void main(String args[]){
        int number[]={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        int i;

        for(i=0;i<=number.length;i++)
        {
            sum +=i;
           
        }
        System.out.print("sum of all integers="+sum);
    }
}
