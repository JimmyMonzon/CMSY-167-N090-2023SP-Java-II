/**
 * Purpose: Practice with algorithms, using different sorting algorithms to sort a randomly generated list
 */

import java.util.Arrays;
import java.util.Random;
public class Algorithm {
    public static void main(String[] args) {

        Random random = new Random();
        int[] randomInts = random.ints(1,1000000).limit(10).toArray();
        int[] copy = randomInts;

        System.out.print("Original list: \n" + Arrays.toString(randomInts));
        System.out.print("\nMerge Copy: \n" + Arrays.toString(copy));

        selectionSort(randomInts);

        System.out.print("\n\nSelection Sort: \n" + Arrays.toString(randomInts));

        sort(copy, 0, copy.length-1);
        System.out.print("\n\nMerge Sort: \n" + Arrays.toString(copy));

    }

    static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    //Source: https://www.geeksforgeeks.org/selection-sort/

    static void mergeSort(int[] arr, int l, int m, int r)
    {
        // Find sizes of two sub-arrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int[] L = new int[n1];
        int[] R = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second sub-arrays
        int i = 0, j = 0;

        // Initial index of merged sub-array array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    //Source: https://www.geeksforgeeks.org/merge-sort/
    static void sort(int[] arr, int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            mergeSort(arr, l, m, r);
        }
    }
    //Source: https://www.geeksforgeeks.org/merge-sort/
}