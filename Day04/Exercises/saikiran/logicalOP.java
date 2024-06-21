package Day04.Exercises.saikiran;

public class logicalOP {
    public static void main(String[] args) {
        int a = 25, b = -11, c = 0;
         System.out.println((a<c && b<c) && (a>c && b>c));
         System.out.println((a>c && b<c) && (a<c && b>c));
         
         System.out.println((a<c && b<c) || (a>c && b>c));
         System.out.println((a>c && b<c) || (a<c && b>c));
         
         System.out.println((a<c || b<c) && (a>c || b>c));
         System.out.println((a>c || b<c) && (a<c || b>c));
         
         System.out.println((a<c || b<c) || (a>c || b>c));
         System.out.println((a>c || b<c) || (a<c || b>c));

    }
}
