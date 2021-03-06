package algorithm;

import java.util.Scanner;

public class LinearSearchDemo {

    public static int LinearSearch(int array[], int x) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 45, 50, 100};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your SearchItem : ");

        int searchItem = input.nextInt();

        int result = LinearSearch(arr, searchItem);
        if (result == -1) {

            System.out.println("SearchItem not found");
        } else {
            System.out.println("SearchItem " + searchItem + " is found an index number  " + result);
        }

    }

}
