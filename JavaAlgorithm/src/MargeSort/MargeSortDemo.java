/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MargeSort;

/**
 *
 * @author Mehedi Hassan
 */
public class MargeSortDemo {

    void margeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;
        margeSort(arr, left, mid);
        margeSort(arr, mid+1, right);
        
        marge(arr, left,mid, right);

    }
    void marge(int[] arr,int left,int mid,int right){
    
    
    }
}
