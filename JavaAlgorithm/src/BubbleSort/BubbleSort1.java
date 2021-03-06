package BubbleSort;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class BubbleSort1 {

    static void bubbleSort(int[] arr, int n) {
        int count = 0;
        int loop2 = 0;
        int loop1 = 0;
        for (int i = 0; i < n; i++) {
            loop1++;
            for (int j = 0; j < n - i - 1; j++) {
                //Now counting number of loops are needed --------------
                loop2++;
                if (arr[j] > arr[j + 1]) {
                    //Number of swap counting -----------

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    count++;

                }
                for (int k = 0; k < n; k++) {
                    System.out.print(arr[k] + " ");

                }
                System.out.println("");

            }

        }

        System.out.println(loop1);
        System.out.println(loop2);
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 5, 8, 7, 2};
        int n = arr.length;

        bubbleSort(arr, n);

    }
}
