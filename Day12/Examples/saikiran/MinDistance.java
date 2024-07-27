package Day12.Examples.saikiran;

public class MinDistance {
    public static void main(String[] args) {
        String[] s={"geeks","for","geeks","contribute","practice"};
        //String[] s={"the","quick","brown","fox","quick"};
        String word1="geeks";
        String word2="for";
        
        boolean match_found1=false;
        boolean match_found2=false;
        int count=0;
        int min_distance=s.length;
        for(int i=0;i<s.length;i++){
            if(match_found1==true){
                count++;
            }
             if(s[i]==word1){
             count=0;
             match_found1=true;
            }

            if(s[i]==word2 && match_found1==true){
                if(count<min_distance){
                    min_distance=count;
                }
                match_found2=true;
            }

        
        }
        
        if(match_found1 && match_found2){
            System.out.print(min_distance);

        }
    }
        
}
