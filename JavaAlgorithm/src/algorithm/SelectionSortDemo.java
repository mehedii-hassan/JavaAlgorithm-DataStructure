package algorithm;

/**
 *
 * @author Mehedi Hassan
 */
public class SelectionSortDemo {

    void SelectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int index_min = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[i]) {

                    index_min = j;
                }
                if (index_min != i) {

                    int temp = array[index_min];
                    array[index_min] = array[i];
                    array[i] = temp;
                }

            }
 
        }

    }

    void PrintElement(int[] array) {

        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");

        }
    }

    public static void main(String[] args) {

        SelectionSortDemo ob = new SelectionSortDemo();

        int[] array = {8, 10, 4,15};
        ob.SelectionSort(array);
        System.out.println("Sorted Array : ");
        ob.PrintElement(array);

    }
}
