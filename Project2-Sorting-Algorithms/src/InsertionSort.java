
import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {

            int currentElament = array[i];
            int j = i;

            // Vergleiche key mit den Elementen links davon
            while (j >= 0 && currentElament < array[j - 1]) {
                array[j] = array[j - 1];
                j --;
            }

            // key an die richtige Position einfügen
            array[j] = currentElament;
        }
    }

    public static void main(String[] args) {
        int[] data = {-1, 10, 16, 9, 5, 1, 4, 3};

        insertionSort(data);

        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));

    }
}
