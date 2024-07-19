package Day11.Examples.saikiran;

public class ArrayTwo {
    public static void main(String[] args) {
        int[][] matrix = { {1,1,2,2},{1,2,2,4},{1,2,3,4},{1,4,1,2} };
        int sum = 0;
        int row = matrix[0].length - 2;
        for (int column= 0; column < 4; column++)
        {
           sum = sum + matrix[row][column];
        }            
        System.out.println(sum);
    }
}
