 
package algorithm;
 
import java.util.Scanner;

public class BinarySearchDemo {
    public static int BinarySearch(int[] array,int x){
        int left = 0;
        int right = array.length -1;
        while(left<=right){
        int mid=(left+right)/2;
        if(array[mid]==x){
       return mid;
        }
        if(array [mid]<x){
            left = mid +1;
        
        }else{
        right = mid -1;
        }
        
        
        
        }
        
    return -1;
    
    
    }
    
    public static void main(String[] args) {
        int[] array={1,2,5,55,80,400,700};
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter your searchItem : ");
        int searchItem= input.nextInt();
        
        int result = BinarySearch(array,searchItem);
        if(result==-1){
        
            System.out.println("SearchItem not found");
        }else{
            System.out.println("SearchItem is found and index number is " + result);
        }
    }
    
}
