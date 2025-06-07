package MethodsPractice;

public class findMaxLoopE {

	    public static int findMax (int[] numbers) { // The parameter type was corrected from 'int numbers' to 'int[] numbers'
	        int max = numbers[0];
	        for (int num : numbers) { // This is an enhanced for loop for iterating through arrays.
	            if (num > max) {
	                max = num;
	            }
	        }
	        return max;
	    }

	    public static void main(String[] args) {
	        int[] nums1 = {5, 2, 9, 1, 5};
	        int[] nums2 = {-3, -7, -2, -8};
	        System.out.println("Max in nums1: " + findMax (nums1));
	        System.out.println("Max in nums2: " + findMax (nums2));
	    }
	}

