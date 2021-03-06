 
package ProblemPractice;

 
public class TwoSum {
   public static int[] TwoSumDemo(int[]array){
        int n =array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(array[i]+array[j]==9){
                
                    //System.out.println("indicies " +i+ " "+j);
                    return new int[] {i,j};
                }
            }
            
        }
    
    return null;
    
    }
    
    public static void main(String[] args) {
        int[] array = {1,2,5,7};
       int[] result =TwoSumDemo(array);
         for (int i = 0; i <result.length; i++) {
             System.out.println(result[i]); 
        }
        
    }
}
