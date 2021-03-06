package algorithm;

public class BubbleSortDemo {

    public static void BubbleSort(int[] array, int n) {

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    //swap array[j+1] and array[j]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }

        }

    }
    //Print the Sorted array

    static void PrintArrays(int[] array) {
        System.out.print("Sorted Array : ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(" "+array[i]);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] array = {9, 1, 7, 10, 15};
        int n = array.length;
        BubbleSort(array, n);
        PrintArrays(array);

    }

}
