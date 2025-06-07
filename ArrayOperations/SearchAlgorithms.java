package ArrayOperations;

public class SearchAlgorithms {

    // Linear search
    // Searches for a target value by checking each element one by one.
    // Works on both sorted and unsorted arrays.
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) { // Iterate through the array 
            if (arr[i] == target) { // If the current element matches the target 
                return i; // Return its index 
            }
        }
        return -1; // If the target is not found after checking all elements, return -1 
    }

    // Binary search (iterative)
    // Efficiently searches for a target value in a SORTED array by repeatedly dividing the search interval in half.
    public static int binarySearch(int[] arr, int target) {
        int left = 0; // Initialize the left boundary of the search interval 
        int right = arr.length - 1; // Initialize the right boundary of the search interval 

        while (left <= right) { // Continue as long as the search interval is valid 
            int mid = left + (right - left) / 2; // Calculate the middle index to prevent overflow 

            if (arr[mid] == target) { // If the middle element is the target 
                return mid; // Return its index 
            }

            if (arr[mid] < target) { // If the middle element is less than the target 
                left = mid + 1; // Discard the left half and search in the right half 
            } else { // If the middle element is greater than the target 
                right = mid - 1; // Discard the right half and search in the left half 
            }
        }
        return -1; // If the loop finishes, the target was not found, return -1 
    }

    public static void main(String[] args) {
        int[] sortedArr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91}; // A sorted array for binary search 
        int[] unsortedArr = {23, 5, 16, 12, 2, 72, 56, 8, 91, 38}; // An unsorted array for linear search 

        System.out.println("Linear search for 16: " + linearSearch(unsortedArr, 16)); // 
        System.out.println("Binary search for 16: " + binarySearch(sortedArr, 16)); // 
        System.out.println("Linear search for 100 (not found): " + linearSearch(unsortedArr, 100));
        System.out.println("Binary search for 100 (not found): " + binarySearch(sortedArr, 100));
    }
}
