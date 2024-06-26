import java.io.*;
import java.util.*;

public class Bubble_Sort {
    /**
     * Sorts a list of integers using the bubble sort algorithm.
     * 
     * @param arr The list of integers to be sorted.
     *
     *            Example:
     *            ```
     *            List<Integer> arr = Arrays.asList(5, 4, 3, 2, 1);
     *            bubbleSort(arr);
     *            // arr is now [1, 2, 3, 4, 5]
     *            ```
     */
    public static void bubbleSort(List<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    Collections.swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    /**
     * Prints the elements of a list.
     * 
     * @param arr The list of integers to be printed.
     *
     *            Example:
     *            ```
     *            List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
     *            print(arr);
     *            // Output: 1 2 3 4 5
     *            ```
     */
    public static void print(List<Integer> arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /**
     * Reads integers from a file and stores them in a list.
     * 
     * @param arr       The list of integers to store the read integers.
     * @param inputFile The input file to read integers from.
     *
     *                  Example:
     *                  ```
     *                  List<Integer> arr = new ArrayList<>();
     *                  read(arr, "test.txt");
     *                  // The integers from the file "test.txt" are now stored in
     *                  arr.
     *                  ```
     */
    public static void read(List<Integer> arr, String inputFile) {
        try (Scanner scanner = new Scanner(new File(inputFile))) {
            while (scanner.hasNextInt()) {
                arr.add(scanner.nextInt());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error opening file");
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        read(arr, "test.txt");

        System.out.print("Before Sorting: ");
        print(arr);
        bubbleSort(arr);
        System.out.print("After Sorting:  ");
        print(arr);
    }
}
