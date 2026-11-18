

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] array) {

        // Schleife für jeden Durchlauf
        for (int i = 0; i < array.length; i++) {

            // Vergleiche benachbarte Elemente
            for (int j = 0; j < array.length - i - 1; j++) {

                // Tauschen, wenn die Reihenfolge falsch ist
                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] data = {-2, 45, 100, 3, 4, 5, 0, 11, -9};

        bubbleSort(data);

        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));
    }
}
