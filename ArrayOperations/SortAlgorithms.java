package ArrayOperations;

import java.util.Arrays; // Needed for Arrays.toString in main method for printing

public class SortAlgorithms {

    // Bubble Sort
    // Repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order.
    public static void bubbleSort(int[] arr) {
        // Outer loop: Controls the number of passes. In each pass, the largest unsorted element "bubbles" to its correct position.
        for (int i = 0; i < arr.length - 1; i++) { // 
            // Inner loop: Performs comparisons and swaps for the current pass.
            // arr.length - 1 - i ensures we don't compare elements already sorted at the end.
            for (int j = 0; j < arr.length - 1 - i; j++) { // 
                if (arr[j] > arr[j + 1]) { // If the current element is greater than the next element 
                    // Swap arr[j] and arr[j + 1] 
                    int temp = arr[j]; // Store current element in a temporary variable 
                    arr[j] = arr[j + 1]; // Move next element to current position 
                    arr[j + 1] = temp; // Move stored element to next position 
                }
            }
        }
    }

    // Selection Sort
    // Finds the minimum element from the unsorted part of the array and puts it at the beginning of the unsorted part.
    public static void selectionSort(int[] arr) {
        // Outer loop: Iterates from the first element to the second-to-last element.
        // 'i' marks the boundary between the sorted and unsorted parts.
        for (int i = 0; i < arr.length - 1; i++) { // 
            int minIndex = i; // Assume the current element is the minimum 
            // Inner loop: Finds the actual minimum element in the remaining unsorted part.
            for (int j = i + 1; j < arr.length; j++) { // 
                if (arr[j] < arr[minIndex]) { // If a smaller element is found 
                    minIndex = j; // Update minIndex to the index of the new minimum 
                }
            }

            // Swap the found minimum element with the element at the current 'i' position.
            // This places the minimum element into its correct sorted position.
            int temp = arr[minIndex]; // 
            arr[minIndex] = arr[i]; // 
            arr[i] = temp; // 
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {64, 34, 25, 12, 22, 11, 90}; // Array for Bubble Sort 
        System.out.println("Original array (arr1): " + Arrays.toString(arr1)); // 
        bubbleSort(arr1); // Sort using Bubble Sort 
        System.out.println("After bubble sort (arr1): " + Arrays.toString(arr1)); // 

        System.out.println(); // Add a blank line for better readability

        int[] arr2 = {64, 34, 25, 12, 22, 11, 90}; // Array for Selection Sort 
        System.out.println("Original array (arr2): " + Arrays.toString(arr2)); // 
        selectionSort(arr2); // Sort using Selection Sort 
        System.out.println("After selection sort (arr2): " + Arrays.toString(arr2)); // 
    }
}
