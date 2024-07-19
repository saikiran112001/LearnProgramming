package Day10.Examples.saikiran;

public class MaxAndMin {
    public static void main(String[] args){
        int array[]={25,14,23,15,36,56,77,18,29,49};
        int max=array[0];
        int min=array[0];
        int length=array.length;
        int i;

        for(i=1;i<length;i++)
        {
            if(array[i]>max)
            max=array[i];
            
            if(array[i]<min)
            min=array[i];
        }
        System.out.println("max number is"+max);
        System.out.println("min value is"+min);
    }
    
}
