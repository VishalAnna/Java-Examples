package ArrayOperations;

public class ArrayBasics {

	    public static void main(String[] args) {
	        // Three ways to initialize arrays

	        int[] arr1 = new int[5]; // Declaration with size 

	        int[] arr2 = {10, 20, 30, 40, 50}; // Declaration with initialization 

	        int[] arr3 = new int[]{5, 10, 15}; // Alternative initialization 

	        // Array traversal techniques

	        System.out.println("For loop:");
	        // A traditional for loop iterates through the array using an index.
	        for (int i = 0; i < arr2.length; i++) { // 
	            System.out.println("arr2[" + i + "] = " + arr2[i]); // 
	        }

	        System.out.println("\nEnhanced for loop:");
	        // An enhanced for loop (for-each loop) iterates over each element directly.
	        for (int num : arr3) { // 
	            System.out.println(num); // 
	        }

	        System.out.println("\nWhile loop:");
	        
	        int i = 0; // Initialize index 
	        while (i < arr1.length) { // Loop as long as the index is within array bounds 
	            arr1[i] = (i + 1) * 100; // Initialize values 
	            System.out.println("arr1[" + i + "] = " + arr1[i]); // Print the element 
	            i++; // Increment the index 
	        }
	    }
	}

