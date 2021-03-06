package BubbleSort;

import java.util.Scanner;

public class BubbleSortDemo {

    static Scanner scanner = new Scanner(System.in);

    public static void bubbleSort(int arr[], int n) {
        int numberOfSwaps = 0;
        for (int i = 0; i < n-1; i++) {

            for (int j = 0; j <n-1 ; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    numberOfSwaps++;
                    if (numberOfSwaps == 0) {
                        break;

                    }
                }

            }

        }
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element : " + arr[0]);
        System.out.println("Last Element : " + arr[n - 1]);

    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();

        }
        bubbleSort(arr, n);

    }

}
