 
package algorithm;

/**
 *
 * @author Mehedi Hassan
 */
public class InsertionSortDemo {
    public static void InsertionSort(int[] array,int n){
        int j,item;
        for (int i = 1; i <n; i++) {
            item = array[i];
            j= i-1;
            
            while(j>=0&&array[j]>item){
            
            array[j+1]=array[j];
            j=j-1;
            
            }
            array[j+1] = item;
            
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
            
        }
    
    
    
    }
    public static void main(String[] args) {
        int[] array = {9,2,3,5,6};
 
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
            
        }
        System.out.println("");
        int n = array.length;
        InsertionSort(array,n);
    }
    
}
