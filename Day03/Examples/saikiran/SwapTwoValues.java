package Day03.Examples.saikiran;

public class SwapTwoValues {
    public static void main(String[] args) {
        int x=3;
        int y=8;
        int z;

        System.out.println("before swap x="+x+"y="+y);

        z=x;
        x=y;
        y=z;

        System.out.println("after swap using 3rd variable x="+x+"y="+y);

        y=y-x;
        x=y+x;
        y=-(y-x);

        System.out.println("after swap without using 3rd variable x="+x+"y="+y);


    }
}
