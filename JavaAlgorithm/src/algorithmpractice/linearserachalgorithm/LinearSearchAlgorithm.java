package algorithmpractice.linearserachalgorithm;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class LinearSearchAlgorithm {

    static Scanner scanner = new Scanner(System.in);

    static public int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.print("Element found and index number is : ");
                return i;
            } 

        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.print("Enter your searching number : ");
        int x = scanner.nextInt();
        int[] arr = {10, 20, 30, 40, 50, 60, 1, 5, 33};
        int a = linearSearch(arr, x);
        System.out.print("index num is " + a);
        System.out.println("");
    }

}
