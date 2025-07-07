package Recursion;

public class BinarySearch {
	
	public static int binaryS(int[] arr, int target, int low , int high) {
		if (low > high) {
			return -1 ;
			
		}
		int mid = low + (high - low)/2 ;
		if ( arr[mid] == target) {
			return mid;
		}else if (arr[mid] < target) {
			return binaryS(arr, target, mid +1, high);
			
		}else {
			return binaryS(arr, target, low, mid - 1);
		}
	}
	

	public static void main(String[] args) {
       int[] sortedArray = {2,5,7,8,13,15,38 };
       int target = 13;
       int result = binaryS(sortedArray, target, 0, sortedArray.length - 1);
       System.out.println("Element found at index : " + result);
	}

}
