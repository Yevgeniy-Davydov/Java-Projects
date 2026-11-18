import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int minIndex = i;

            // Kleinstes Element suchen
            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Tauschen
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static void main(String[] args) {

        int[] data = { -2, 45, 0, 11, -9 };

        selectionSort(data);

        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));
    }
}