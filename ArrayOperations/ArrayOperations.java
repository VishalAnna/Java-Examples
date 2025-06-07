package ArrayOperations;

import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 27, 8, 16, 3}; // Original array 

        // Sorting
        Arrays.sort(numbers); // Sorts the array in ascending order 
        System.out.println("Sorted array : " + Arrays.toString(numbers)); // Prints the sorted array 

        // Searching
        int key = 16; // The value to search for 
        // Performs a binary search on the sorted array. The array must be sorted for this to work correctly.
        int index = Arrays.binarySearch(numbers, key); // 
        System.out.println(key + " found at index : " + index); // Prints the index where the key was found 

        // Copying arrays
        // Creates a full copy of the 'numbers' array.
        int[] copy1 = Arrays.copyOf(numbers, numbers.length); // 
        // Creates a copy of a specific range from 'numbers' (from index 2 inclusive, to 5 exclusive).
        int[] copy2 = Arrays.copyOfRange(numbers, 2, 5); // 

        System.out.println(" Full copy : " + Arrays.toString(copy1)); // Prints the full copy 
        System.out.println(" Range copy : " + Arrays.toString(copy2)); // Prints the range copy 

        // Filling arrays
        int[] filledArray = new int[5]; // Creates a new array of size 5 
        Arrays.fill(filledArray, 42); // Fills all elements of the array with the value 42 
        System.out.println(" Filled array : " + Arrays.toString(filledArray)); // Prints the filled array 

        // Comparing arrays
        // Compares if two arrays are equal (same length and same elements in the same order).
        System.out.println(" Arrays equal ? " + Arrays.equals(numbers, copy1)); // 
    }
}
	