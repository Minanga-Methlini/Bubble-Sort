import java.util.Arrays;

class BubbleSort {
    // Method to swap two elements in the array
    public void swap(int[] number, int i, int j) {
        int temp = number[i];
        number[i] = number[j];
        number[j] = temp;
    }

    // Bubble Sort algorithm
    public void bubbleSort(int[] number) {
        int n = number.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (number[j] > number[j + 1]) {
                    swap(number, j, j + 1);
                }
            }
        }
    }
}

public class BubbleSortTest {
    public static void main(String[] args) {
        // Initialize the array
        int[] number = {8, 3, 1, 4, 5, 11, 7, 2, 17, 13};

        // Create an instance of BubbleSort
        BubbleSort bubbleSort = new BubbleSort();

        // Print the original array
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(number));

        // Sort the array using bubbleSort
        bubbleSort.bubbleSort(number);

        // Print the sorted array
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(number));
    }
}
