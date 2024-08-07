package Day12.Examples.saikiran;

public class ReplaceString {
    
    public static void main(String[] args) {
        String s1="geeks gor geeks";
        String s2=s1.substring(0,6)+s1.substring(7,15);
        char chartoadd='f';
        StringBuilder s3=new StringBuilder(s2);
        s3.insert(6,chartoadd);
        System.out.println(s3);
    }
}
