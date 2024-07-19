package Day10.Exercises.saikiran;

public class AvgOfTenIntegers {
    public static void main(String args[]){

        int array[]={11,12,13,14,15,16,17,18,19,20};
        int i;
        int sum=0;

        for(i=0;i<array.length;i++)
        {
            sum += array[i];
        }
        
        int average = sum/array.length;
        System.out.println("average="+average);
    }
}
