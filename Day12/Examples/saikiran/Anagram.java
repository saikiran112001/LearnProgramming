package Day12.Examples.saikiran;

import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        String a="listen";
        String b="silent";

        char ch1[]=a.toCharArray();
        char ch2[]=b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){
            System.out.println("is anagram");
        }
        else{
            System.out.println("not anagram");
        }

    }
}
