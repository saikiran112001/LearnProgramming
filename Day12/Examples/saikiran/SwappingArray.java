package Day12.Examples.saikiran;

public class SwappingArray {
    public static void main(String[] args) {
        
        String str="javav";
        char[] b=str.toCharArray();
        char temp;
        
        for(int i=0;i<b.length-1;i+=2){
            temp=b[i];
            b[i]=b[i+1];
            b[i+1]=temp;
        }
        for(int i=0;i<b.length;i++){
     
        System.out.print(b[i]);
        }
    
        
    }
}

