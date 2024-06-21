package Day04.Examples.saikiran;

public class LogicalOperators {
    public static void main(String[] args) {
        int i = 1, j = 0;
         boolean a,b,c;
         a = b = c = true;
         System.out.println(i != 0 && j != 0);
         System.out.println(i != 0 || j != 0);
         
         System.out.println(a && b && c);
         System.out.println(!a && b && c);
         System.out.println(!a || (b && c));
         System.out.println(a || (!b && c));
    }
}
