package Day12.Exercises.saikiran;
public class FullName {
    public static void main(String[] args) {
        MyName f= new MyName();
        String res = f.FullName("saikiran","reddy","b");
        System.out.println(res);
        
    }
}
 class MyName{
public String FullName(String Fname,String Mname,String Lname){
    return Fname+"  "+Mname+"  "+Lname;
}
}