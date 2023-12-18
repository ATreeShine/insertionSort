import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] randomArray = {1, 3, 8, 2, 4, 6, 2, 3};
        sort(randomArray);
        System.out.println(Arrays.toString(randomArray));
    }
}
